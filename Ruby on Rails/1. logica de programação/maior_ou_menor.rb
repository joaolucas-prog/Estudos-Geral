def da_boas_vindas
    puts "Bem vindo ao jogo da Adivinhação" # "print"
    puts "Qual e seu nome"
    nome = gets.strip #criando variavel nome e fazendo um input e retirando do inicio e final espaços e quebra de linha
    puts "Começaremos o jogo para você, #{nome}" # interpolando string para não usar nome.to_s por exemplo
    puts "\n\n\n\n"
end

def sorteia_numero_secreto
    puts "Escolhendo um número secreto entro 0 e 300"
    sorteado = 150 
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

pontos_ate_agora = 1000
da_boas_vindas
numero_secreto = sorteia_numero_secreto
chutes = [] #array
limite_de_tentativas = 5

for tentativa in 1..limite_de_tentativas # for in
    chute = pede_um_numero chutes,tentativa,limite_de_tentativas# programadores ruby não coloca ()
    chutes << chute# adiciona na ultima posição de chutes o chute 
    pontos_ate_agora = (chute - numero_secreto).abs / 2.0
    pontos_ate_agora -= pontos_a_perder
    if verifica_se_acertou numero_secreto,chute # poderia usar break if e retirar o break e end
        break
    end
end

puts "Você ganhou #{pontos_ate_agora} pontos"