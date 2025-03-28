
# Microserviço de E-mail  
## Desafio de Backend da Uber

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)  
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)  
[![Licença](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

Este projeto é uma API construída usando **Java, Java Spring, AWS Simple Email Service.**

O Microserviço foi desenvolvido para o meu [Canal no Youtube](https://youtu.be/eFgeO9M9lLw?si=uyhUXrR-NLEpBW6p), para demonstrar como resolver o [Desafio de Backend da Uber](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).

## Índice

- [Instalação](#installation)
- [Configuração](#configuration)
- [Uso](#usage)
- [Endpoints da API](#api-endpoints)
- [Banco de Dados](#database)
- [Contribuições](#contributing)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/pedrohenriquebasilio/Challenge-uber.git
```

2. Instale as dependências com o Maven

3. Atualize `application.properties` colocando suas Credenciais AWS

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```

## Uso

1. Inicie a aplicação com Maven
2. A API estará acessível em http://localhost:8080

## Endpoints da API
A API fornece os seguintes endpoints:

**GET E-MAIL**  
```markdown
POST /api/email/send - Enviar um e-mail do seu remetente para o destino
```

**CORPO**  
```json
{
  "to": "pedrobasiliocontato@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```

## Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, por favor, abra uma issue ou envie um pull request para o repositório.

Ao contribuir para este projeto, siga o estilo de código existente, as [convenções de commit](https://www.conventionalcommits.org/en/v1.0.0/) e envie suas mudanças em uma branch separada.
