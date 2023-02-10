# Processamento Multithread em CPU
 
 Para compreender o conceito de programacao paralela, foi proposto o desafio de desenvolver uma aplicacao que simule uma de corrida de grilos em multi-thread, seguindo os criterios:

-Cada grilo deve ser implementado em uma thread;
-O número de grilos deverá ser variável, definido na aplicação;
-Cada grilo pula uma distância randomica a cada iteração;
-O sistema deve definir uma linha de chegada (distância total), podendo a mesma ser alterada na aplicação;
-Ao final, deve-se exibir o total percorrido e o número de pulos de cada grilo.
 
A execução da aplicação deve imprimir um log de informação, conforme o exemplo abaixo:
 
 
O Grilo_01 pulou 21cm        e já percorreu 21cm
O Grilo_02 pulou 21cm        e já percorreu 21cm
O Grilo_03 pulou 47cm        e já percorreu 47cm
O Grilo_05 pulou 46cm        e já percorreu 46cm
O Grilo_01 pulou 34cm        e já percorreu 55cm
Grilo_03 alcançou a linha de chegada com 7 pulos
O Grilo_05 pulou 49cm        e já percorreu 200cm
Grilo_05 alcançou a linha de chegada com7 pulos
Grilo_02 alcançou a linha de chegada com 9 pulos
Grilo_01 alcançou a linha de chegada com 8 pulos
O Grilo_04 pulou 31cm        e já percorreu 200cm
Grilo_04 alcançou a linha de chegada com 9 pulos

