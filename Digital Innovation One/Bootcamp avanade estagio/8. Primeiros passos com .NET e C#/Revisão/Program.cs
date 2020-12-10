using System;

namespace Revisão
{
    class Program
    {
        static void Main(string[] args)
        {
           
            string opcaoUsuario = ObterOpcaoUsuario();
            Aluno[] alunos = new Aluno[5];
            int contador = 0;
            while(opcaoUsuario.ToUpper() != "X"){
                switch(opcaoUsuario){
                    case "1":
                        Console.WriteLine("Informe o nome do Aluno:");
                        Aluno aluno = new Aluno();
                        aluno.Nome = Console.ReadLine();
                        Console.WriteLine("Informe a nota do Aluno");
                        if(decimal.TryParse(Console.ReadLine(),out decimal nota)){
                            aluno.Nota = nota;
                        }else{
                            throw new ArgumentException();
                        }
                        alunos[contador] = aluno;
                        contador++;
                        break;
                    case "2":
                        foreach(var a in alunos){
                            if(!string.IsNullOrEmpty(a.Nome)){
                                Console.WriteLine($"Aluno: {a.Nome} - Nota: {a.Nota}");
                            }
                        }
                        break;
                    case "3":
                        decimal somaNota = 0;
                        var qntAlunos = 0;
                        for(int i = 0 ; i < alunos.Length ; i++){
                            if(!string.IsNullOrEmpty(alunos[i].Nome)){
                                somaNota+=alunos[i].Nota;
                                qntAlunos++;
                            }
                            
                        }
                        var media = somaNota/qntAlunos;
                        if( media >=7 ){
                            Console.WriteLine($"MEDIA: {media} - SITUAÇÃO: {Conceito.A}");
                        }else if(media>=3 && media<7){
                            Console.WriteLine($"MEDIA: {media} - SITUAÇÃO: {Conceito.B}");
                        }else{
                            Console.WriteLine($"MEDIA: {media} - SITUAÇÃO: {Conceito.B}");
                        }
                        break;
                    default:
                        throw new ArgumentOutOfRangeException();
                }
                opcaoUsuario = ObterOpcaoUsuario();
            }
        }

        public static string ObterOpcaoUsuario(){
                Console.WriteLine();
                Console.WriteLine("Informe a opção desejada");
                Console.WriteLine("1. Inserir alunos");
                Console.WriteLine("2. Listar alunos");
                Console.WriteLine("3. Calcular média geral");
                Console.WriteLine("X- Sair");
                Console.WriteLine();

                string opcaoUsuario = Console.ReadLine();
                return opcaoUsuario;
        }
    }
}
