# planetas-sw-api
API com os dados dos planetas do Star Wars em Java e MongoDB

Este projeto foi idealizado para participar de um processo seletivo para desenvolvedor na empresa B2W Digital.


OBJETIVO
 - Desenvolver uma API que contenha os dados dos planetas do Star Wars

Foi realizado através de muitas pesquisas e leitura de tutoriais e visa atender os seguintes requesitos:

 - Criar uma API REST;
 - Para cada planeta, os seguintes dados devem ser obtidos do banco de dados da aplicação, sendo inserido manualmente:
        
        Nome
        Clima
        Terreno
        
- Para cada planeta também devemos ter a quantidade de aparições em filmes, que podem ser obtidas pela API pública do Star Wars:  https://swapi.co/.


FUNCIONALIDADES DESEJADAS 

- Adicionar um planeta (com nome, clima e terreno)
- Listar planetas
- Buscar por nome
- Buscar por ID
- Remover planeta

LINGUAGEM USADA
 - Java
 
 BD
  - MongoDB
  
Atributos:
 - Id, Nome, clima, terreno, qtdFilmes
 
  
RECURSOS

 - LISTAR PLANETAS
    Exemplo de pedido: localhost:8080/api/planetassw/

 - BUSCAR POR ID
    Exemplo de pedido: localhost:8080/api/planetassw/(ID)
    
 - BUSCAR POR NOME
    Exemplo de pedido: localhost:8080/api/planetassw/nome/
    
© Pedro Henrique 2018
