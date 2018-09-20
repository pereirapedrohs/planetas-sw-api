# planetas-sw-api
API com os dados dos planetas do Star Wars em Java e MongoDB

Este projeto foi idealizado para participar de um processo seletivo para desenvolvedor na empresa B2W Digital.

# OBJETIVO

Desenvolver uma API que contenha os dados dos planetas do Star Wars
    Foi realizado através de muitas pesquisas e leitura de tutoriais e visa atender os seguintes requisitos:

    Criar uma API REST;

Para cada planeta, os seguintes dados devem ser obtidos do banco de dados da aplicação, sendo inserido manualmente:

        Nome
        Clima
        Terreno

    Para cada planeta também deve ter a quantidade de aparições em filmes, que podem ser obtidas pela API pública do Star Wars: https://swapi.co/.

# FUNCIONALIDADES DESEJADAS

    - Adicionar um planeta (com nome, clima e terreno)
    - Listar planetas
    - Buscar por nome
    - Buscar por ID
    - Remover planeta

## LINGUAGEM USADA
    
    - Java

## BD
    
    - MongoDB

## Atributos:

        Id, Nome, clima, terreno, qtdFilmes
        
# AMBIENTE

Usar MongoDB com database "planetasswapi". Caso deseje, existe um BKP do banco usado para teste dentro repositório abaixo:

    planetas-sw-api/MongoDB/dados/planetasswapi/


# RECURSOS

### LISTAR PLANETAS (GET) 
    Exemplo de pedido: "http://localhost:8080/api/planetassw/"
  
### ADICIONAR PLANETA (POST) 
    Exemplo de pedido:"http://localhost:8080/api/planetassw/"
    
**BODY**
    { 
    "nome": "Naboo", 
    "clima": "temperado", 
    "terreno": "colinas relvadas, pântanos, florestas, montanhas" 
    }

### BUSCAR POR ID (GET) 
    Exemplo de pedido: "http://localhost:8080/api/planetassw/{id}"

### BUSCAR POR NOME (GET) 
    Exemplo de pedido: "http://localhost:8080/api/planetassw/nome/{nome}"

### REMOVER POR ID (DELETE) 
    Exemplo de pedido: "http://localhost:8080/api/planetassw/{id}"

### UPDATE POR ID (PUT) 
    Exemplo de pedido: "http://localhost:8080/api/planetassw/{id}"

**BODY** 

    { 
    "nome": "Naboo", 
    "clima": "temperado", 
     "terreno": "florestas, montanhas"
     }

© Pedro Henrique 2018