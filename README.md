Implementar uma API REST que permita o completo gerenciamento das informações dos empregados por meio de requisições HTTP. Onde é possível inserir (POST), obter (GET), alterar (PUT) e remover (DELETE) os dados dos funcionários. 

Chamada GET pela URL: “http://localhost:8080/api/funcionarios”, onde pode ser verificados os dados dos funcionários salvos no baco de dados do PostgreSQL. 

Retornando um JSON: 

[ 

    { 

        "nome": "Darirene Santana Matos", 

        "telefone": "(61) 99554-5612", 

        "email": "Darirene_Santana_Ms@mgs.com", 

        "alergia": "Lactose", 

        "problemaMedicos": "Diabeste", 

        "contatoEmergencia": "(52) 99323-5764", 

        "id": 1 

    } 

] 

Chamada POST: "http://localhost:8080/api/funcionarios/{ID do novo funcionário}". 

Chamada PUT: "http://localhost:8080/api/funcionarios/{ID do novo funcionário}". 

Chamada DELETE: "http://localhost:8080/api/funcionarios/{ID do novo funcionário}". 

 

Foi utilizado a plataforma de IDE Eclipse, para criação dos algoritmos e das estruturas e comandos necessário para a implementação da API REST.  

Utilização do Spring Initializr, para a criação dos dados iniciais do Maven, com todas as dependências necessárias. 

Utilizado o PostgreSQL, como DataBese, para guarda os dados dos funcionários que são cadastras pelo POST.
