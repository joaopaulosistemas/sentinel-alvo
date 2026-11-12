import session from 'express-session';
import express from 'express';
const app = express();

// alvo: sentinel-node-session-secret-literal
app.use(session({ secret: 'keyboard cat', resave: false, saveUninitialized: false }));
