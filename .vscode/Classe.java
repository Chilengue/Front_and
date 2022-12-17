

        public  class Classe
        {
            Static Scanner les= new Scanner (System.in);
                    String nome, Propretario, raca, qtdRacao;
                    int idade;
                    Double altura, peso;
                    Boolean Vacinado;


                    void NomeCachoro()
                    {
                        System.out.println("Digite o nome do cachoro");
                        this.nome=les.next();
                        System.out.println("Digite sua raca ");
                        this.raca=les.next();
                    }

                String egetEstadoDeSaude(int idade)
                    {
                        System.out.println("Digite  Nome do cachoro");
                        nome=les.next();
                        System.out.println("Digite  meses de vida ");
                        idade=les.nextInt();
                        if (idade>1)
                        {
                                    System.out.println(" Nao e saudavel");
                        }
                        else
                        {
                            System.out.println(" cachoro saudavel");
                        }
                        return idade;
                    }
                    double Calcula_Valor()
                    {

                    }
                    double valor_mensal(double Valor, double ValorAnual)
                    {
                      ValorAnual=(20*900)  
                        return ValorAnual;
                    }
        }
       