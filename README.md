Uma clínica médica que atende por ordem de chegada contratou você e sua dupla/trio para criar o 
software que fará o gerenciamento de suas consultas. 
Para tanto, criar uma classe chamada Medico que terá os seguintes atributos: CRM (int), nome 
(String) e especialidade (String). Crie os métodos básicos para a classe.  
Criar, também, uma classe Paciente que terá os seguintes atributos: codigo (int), nome (String). Crie 
os métodos básicos para a classe.



Há necessidade de criar a classe Consulta. Esta classe terá os seguintes atributos: nro (int), data 
(Data), medico (Medico), paciente (Paciente) e valor (double). Crie os métodos básicos para a classe.  
Vocês precisarão de uma classe Data que deve ser implementada. Esta classe possui os seguintes 
atributos: dia (int), mês (int), ano (int). Crie os métodos básicos para a classe. Crie também um 
método que verifica se a data é válida que retorna true se a data é válida e false se a data não é 
válida. Validação deve envolver dia (1 a 31, dependendo do mês), mês (1 a 12)  e ano (bissexto).  
O gerenciamento das consultas deve ser feito na classe Agenda que também deve ser criada. Nesta 
classe, serão armazenadas as consultas de uma semana de funcionamento. Crie um construtor que 
cria a agenda (vetor de objetos) que pode armazenar até 40 consultas. Além do construtor, esta 
classe deve ter os seguintes métodos:  
adicionarConsulta (insere um objeto consulta no vetor e para isto, recebe o objeto consulta e 
retorna true se a inserção pode ser realizada ou false se a inserção não foi possível); 
removerConsulta (recebe o nro da consulta e, caso ela exista, remove a consulta da agenda, 
reorganiza os objetos e retorna true se a remoção foi realizada com sucesso ou false se a remoção 
não foi possível); 
buscarConsultaPorNro (recebe o número da consulta e retorna a consulta que possui este número); 
buscarPosicao (recebe o nro da consulta e retorna a posição do vetor em que a consulta está 
armazenada. Caso não esteja armazenada, retorna o valor -1); 
buscarConsultaMedico (recebe o nome do médico e retorna um vetor com as consultas que este 
médico tem agendadas – considere as consultas do primeiro médico encontrado com o nome 
passado como parâmetro); 
buscarConsultaPaciente (recebe o código do paciente e retorna a data da primeira consulta 
agendada); 
1 
buscarConsultaData (recebe o dia, mês e ano a ser consultado e retorna um vetor com as consultas 
da data); 
buscarValorConsultasPorEspecialidadeMedica (recebe uma especialidade e retorna o valor total das 
consultas realizadas por médicos desta especialidade); 
alterarMedico (recebe o nro da consulta e o novo médico, substitui o antigo médico pelo novo 
passado por parâmetro); 
buscarConsultaMaisBarata (retorna a consulta que possui o menor valor) 
mostraAgenda (mostra os dados das consultas agendadas). 
Crie uma classe Application que deverá ter o método main com as seguintes funcionalidades que 
deverão acionar o(s) métodos adequados para a realização da operação escolhida. 
1 – Incluir consulta 
2 – Remover consulta 
3 – Mostrar consultas 
4 – Consultas de um médico 
5 – Data da consulta de um paciente 
6 – Consultas por data 
7 – Valor das consultas por especialidade médica 
8 – Alterar médico da consulta 
9 – Consulta com o menor valor cobrado 
10 – Sair do programa 
Considerações gerais: 
1) Seu programa deve executar enquanto a opção de saída (opção 10) não for informada. 
2) As opções 1 e 2 (Adicionar/Remover consulta) deve mostrar mensagem informando se a 
inserção/remoção foi feita com sucesso ou se a inserção/remoção não pode ser efetuada. 
3) A opção 1 (Adicionar consulta) o nro da consulta será um número sequencial incrementado em 
um a cada nova consulta. Além disso, só podem ser adicionadas consultas para datas válidas. 
4) As opções 4, 5, 6 e 7 mostram as consultas, conforme a funcionalidade, caso os critérios de busca 
não existirem, mostrar mensagem adequada. 
5) A opção 8 (Alterar médico) só poderá executar as ações se a consulta estiver agendada. 
