# Java HTTP Server
Servidor HTTP simples feito em Java utilizando de sockets. 

## Instalação
 Siga os passos a baixo para instalação:

1. Certifique-se de ter um JavaSDK instalado na sua máquina;
2. Na pasta do projeto, rode o seguinte comando:

```
javac HTTPServer.java
```

4. Inicie o Servidor com o seguinte comando:

```
java HTTPServer
```

4. O servidor estará disponível em:  ``http://localhost:1234``

## Recursos
- Aceita chamadas GET
- Em / retorna a página principal e código `200`
- Se digitada um rota não existente, retorna `404`

## Códigos possíveis:

> `200 (OK)`
> `404 (Not Found)`
