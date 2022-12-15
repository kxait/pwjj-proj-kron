import { setState, state } from './state.js'
import {createPubsub} from './pubsub.js'
import { messageTypes } from './messageTypes.js';

const { publish, subscribe } = createPubsub();

const makeSocket = url => new Promise((res, rej) => {    
    setState({ socket: new WebSocket(url) })
    const s = state();
    s.socket.addEventListener('open', e => {
        console.debug('socket open');
        res();
    });
    s.socket.addEventListener('close', e => {
        console.debug('socket closed');
        rej();
    });
    s.socket.addEventListener('message', e => {
        var data = JSON.parse(e.data);
        publish(data);
    });
});

const sendSocket = data => new Promise((res, rej) => {
    const id = JSON.parse(data).id;
    const unsubscribe = subscribe(data => { 
        if(data == null || data.id == null || (data.id === id && data.type === messageTypes.serverErr))
            rej();
        if(data != null && data.id === id) {
            res(data);
            unsubscribe();
        }
        
    });
    state().socket.send(data);
});

const subscribeSocket = subscribe;
export {
    makeSocket,
    sendSocket,
    subscribeSocket
}