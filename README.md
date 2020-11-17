# PS2semestre3SIS
Precisamos que CHAPPiE saiba o que fazer, para isso precisamos ter definido
quais ações ele pode realizar e também gerenciar essas ações, além é claro de
criar execuções dessas ações que ele irá realizar. Para isso desenvolva uma
aplicação utilizando Spring Boot, Gradle, JPA e todas as boas práticas uma API
REST para o cadastro dessas ações, listagem de todas, busca por id, editar ou
deletar seguindo as seguintes regras:

 • A ação deve ter os atributos id, nome, descrição e ativo, onde id
deverá ser um número incremental, nome um texto de até 40
caracteres, descrição um texto até 100 caracteres e ativo um booleano,
para dizer se a ação está ativa ou não, sendo obrigatório informar todos
os campos

 • Uma ação pode ter várias execuções
 
 
 • Criar testes de integração para os mapeamentos
Com as ações registradas podemos executar as mesmas, então crie um novo
controller de execuções que deverá listar todas as realizadas, recuperar pelo ID
e cadastrar uma nova execução. 


# Regras:
 • A execução deve ter um id incremental, a ação que a execução está
vinculada e uma data com horário de quando ocorreu aquela execução


 • Uma execução só pode ser cadastrada se a ação que está vinculada se
encontra ativa, caso contrário não poderá ocorrer aquela execução


 • Criar testes de integração para os mapeamentos e unitário para a regra
da execução de uma ação
Lembre-se, caso ocorra algum problema como uma exception lançada a
aplicação deve retornar uma mensagem amigável e com um status code da
resposta correspondente ao erro que ocorreu.
Com tudo pronto, exporte o arquivo das collections criadas no Postman para
testes da API REST e salve junto com o projeto
