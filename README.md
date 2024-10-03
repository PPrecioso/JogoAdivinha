# *Jodo Adivinha*
Jogo de adivinhação onde o jogador deve adivinhar um número gerado aleatoriamente que está entre 1 e 100. O objetivo do jogo é que o usuário forneça palpites até que consiga adivinhar corretamente o número. O aplicativo fornece feedback sobre os palpites, informando se o número correto é maior ou menor que o palpite dado.

# *Resumo do Funcionamento do Jogo*

# Geração de Número Aleatório :
O número a ser adivinhado é gerado aleatoriamente entre 1 e 100 quando o jogo é iniciado. Isso é feito utilizando uma classe Random.

# Contagem de Tentativas :
O aplicativo conta com muitas experiências que o jogador fez e exibe esse número na interface.

# Entrada do Usuário :
O jogador insere um palpite através de um EditText, onde o aplicativo espera que o usuário insira um número.

# *Feedback do Jogo*
Quando o usuário clica no botão "OK", o aplicativo verifica se o palpite está correto:
Se o número estiver fora do intervalo de 1 a 100, uma mensagem de erro será exibida.
Se o palpite estiver correto, o usuário está parabenizado, e o jogo reinicia.
Se o palpite não estiver correto, o aplicativo informa se o número correto é maior ou menor que o palpite.

# *Dicas*
O jogador pode clicar em um botão para receber dicas sobre o número, se ele for par ou ímpar.

# *Estrutura do Código*
onCreate(): Inicializa a interface e começa o jogo.
iniciarJogo(): Reiniciando o jogo, gerando um novo número aleatório e reiniciando as tentativas.
btDicaTP(): Fornece dicas sobre a paridade do número.
adivinharTP(): Processa o palpite do usuário e fornece feedback.
btMenosTP()e btMaisTP(): Ações para ajudar o usuário com dicas, embora apenas exibam mensagens no código atual.
activity_main.xml: Define a interface do usuário utilizando ConstraintLayout, componentes como TextViewpara exibir mensagens, EditTextpara entrada de números e Buttonpara interações. A interface é estilizada com cores e tamanhos de texto adequados, criando uma experiência visual agradável para o jogador.

![Captura de tela 2024-10-03 132613](https://github.com/user-attachments/assets/b206f679-f9c4-4396-a050-f7cf27d75975)

