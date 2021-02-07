# variáveis
nome = "joão" #string
idade = 21 #int
acertou = true #boolean

#print
puts nome +" "+ idade.to_s# cast para string

#input
nome = gets #gets retorna um string
puts nome

#cast
#to_i para int
#to_s para string

#funcão
def imprime_oi 
    puts "oi"
    
end

imprime_oi

#condicional if
if nome.to_s == "joão"
    puts nome
else 
    puts "não é joao"
end

#range 

1..3 # 1 até 3
0...3 # 0 até 2

#condicional for
for i in 1..3
    puts i
end

#array
numeros = []
numeros << 1 #adiciona 1 no ultimo elemento do array
numeros << 2
puts "#{numeros}"

#alguns metodos

puts numeros.size
