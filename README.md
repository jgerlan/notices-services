Um CRUD com API Restful feita com Springboot e Java consumido por uma página Web.

Como executar a API:
Após a importação do projeto execute a classe NoticesServicesApplication.java em com.enotices.springboot.noticesservices

Ainda não possui interface web para consumir a API.

Utilizar POSTMAN ou similar para obter as requisições.

Para listar notícias
http://localhost:8080/api/news

Adicionar noticia
http://localhost:8080/api/notice

json
{
"newsTitle": "AdicionadoViaPost",
"newsTag": "#testeTag",
"newsContent": "otimo!"
}

Exibir uma noticia por ID
http://localhost:8080/api/notice/{id}
