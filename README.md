# Trabalho Programação Modular

## Objetivo:

O trabalho possui como objetivo desenvolver um jogo onde ocorre uma disputa entre robôs lunares para a prospecção de Hélio-3, e para tal, foram utilizados princípios da programação orientada a objetos, como objetos e classes.

Além disso, cada equipe possui uma quantidade n de robos, sendo que estes são instanciados em posições aleatórias no solo lunar. Vence o jogo a equipe cujo robôs conseguirem prospectar mais Hélio-3 durante o tempo do jogo. 


## Execução Do Programa

As informações do jogo, como o tamanho do terreno, neste caso, o tamanho do espaço a ser explorado na lua, tempo do jogo e a quantidade de equipes, são dados em um arquivo de entrada, "entrada.json". Ademais, para cada equipe, nesse mesmo arquivo, são dadas as informações como o nome e a quantidade de robôs dessa.

Dessa forma, esses dados são coletados do arquivo json e armazenados em variáveis do programa. Além disso, foi criada uma classe "Controlador" que tem por finalidade gerar as posições e comandos aleatórios como "Andar", "Sondar" e "GirarDireita", para cada robô de cada equipe. A partir disso, através das ações geradas por cada robô através de um controlador, o programa retorna as informações desses comandos, por exemplo, se o controlador chama o comando "Andar", é retornada uma string "Comando Andar" para informar que o robô x realizou aquela ação. 

Outrossim, essas saídas são geradas enquanto o tempo, um atributo da classe Controlador, for menor que o tempo do jogo. Ao final do jogo, é informado o nome e a quantidade de barris coletados da equipe vencedora.


## Integrantes

Igor Augusto de Serpa e Cunha

Isabelle Cristine do Carmo Matos

Lucas Henrique Valentim Rocha


