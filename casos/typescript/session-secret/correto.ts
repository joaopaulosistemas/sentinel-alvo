// correto: sentinel-node-session-secret-literal
import session from 'express-session';
import express from 'express';
const app = express();

app.use(session({ secret: process.env.SESSION_SECRET as string, resave: false, saveUninitialized: false }));
