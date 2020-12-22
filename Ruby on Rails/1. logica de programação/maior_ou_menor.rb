def da_boas_vindas
    puts "Bem vindo ao jogo da Adivinhação" # "print"
    puts "Qual e seu nome"
    nome = gets.strip #criando variavel nome e fazendo um input e retirando do inicio e final espaços e quebra de linha
    puts "Começaremos o jogo para você, #{nome}" # interpolando string para não usar nome.to_s por exemplo
    puts "\n\n\n\n"
    nome
end

def sorteia_numero_secreto (dificuldade)
    case dificuldade
    when 1
        maximo = 30
    when 2
        maximo = 60
    when 3
        maximo = 100
    when 4
        maximo = 150
    else
        maximo = 200
    end
    puts "Escolhendo um número secreto entre 1 e #{maximo}"
    sorteado = rand(maximo) + 1
    puts "Escolhido.. que tal adivinhar o número"
    sorteado# no ruby toda função sempre retorna algo , e esse algo é a ultima linha e não precisa do nome return
end

def pede_um_numero(chutes ,tentativa , limite_de_tentativas)
    puts "\n\n\n\n"
    puts "Tentativa #{tentativa} de #{limite_de_tentativas} "
    puts "Chutes até agora: #{chutes} "
    puts "Entre com o número"
    chute = gets.strip
    puts "Será que acertou? Chute: #{chute}"
    chute.to_i
end

def verifica_se_acertou(numero_secreto,chute)
    acertou = chute == numero_secreto #comparação booleano e converter de string para integer 
    if acertou  # if/else/end
        puts "Você acertou"
        return true
    end   
    maior = numero_secreto > chute
    if maior
        puts "Número secreto é maior"
    else
        puts "Número secreto é menor"
        
    end
    false
end

def pede_uma_dificuldade
    puts "Escolha uma dificuldade entre 1 e 5 (1 fácil...5 difícil)"
    dificuldade = gets.to_i
    dificuldade
end

def joga nome,dificuldade
    pontos_ate_agora = 1000
    numero_secreto = sorteia_numero_secreto dificuldade
    chutes = [] #array
    limite_de_tentativas = 5

    for tentativa in 1..limite_de_tentativas # for in
        chute = pede_um_numero chutes,tentativa,limite_de_tentativas# programadores ruby não coloca ()
        chutes << chute# adiciona na ultima posição de chutes o chute 
        pontos_a_perder = (chute - numero_secreto).abs / 2.0
        pontos_ate_agora -= pontos_a_perder
        if verifica_se_acertou numero_secreto,chute # poderia usar break if e retirar o break e end
            break
        end
    end
    puts "Você ganhou #{pontos_ate_agora} pontos"
end

def nao_quer_jogar?
    puts "Deseja jogar Novamente ?"
    resposta = gets.strip
    resposta.upcase == "N"
end

nome = da_boas_vindas
dificuldade = pede_uma_dificuldade
loop do
    joga nome,dificuldade
    if nao_quer_jogar?
        break
    end
end

