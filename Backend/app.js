import { createServer } from 'http'

const hostname = 'localhost';
const port = 3000;
const server = createServer((req, res) => {
    res.statusCode = 200;
    res.setHeader("content-type", 'text/plain');
    res.end('Hello World')
})

server.listen(port, hostname, () => {
    console.log(`Server is runnign at http://${hostname}:${port}`);
})