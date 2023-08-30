# SOLID

</br></br>

Principios da Orientação a Objetos
coesão
      uniao harmonica entre uma coisa e outra
      classes não coesas tendem a crescer indefinidamente, o que as tornam dificeis de manter
      Cada classe deve ser responsável por apenas uma coisa, e deve executar esta tarefa muito bem
      Classes coesas não devem ter várias responsabilidades
-encapsulamento
      incluir ou proteger algo em uma capsula
      classes nao encapsuladas permitem violação de regras de negocio, alem de aumentarem o acoplamento
      forma de manter os objetos das nossas classes protegidos, fornecendo apenas o que é estritamente necessário para o mundo exterior
      colocar private
      Ao encapsular o acesso a determinados dados, liberando acesso apenas ao necessário, os objetos da nossa classe se tornam mais       fáceis de serem utilizados.
      e nao colocar setter em tudo
      senao qlqr pessoa pode mexer sem regras
      criar getters e setters para tudo quebra o encapsulamento da nossa classe.
      geralmente a falta de encapsulamento gera um acoplamento maior
      Getters e setters não são formas eficientes de aplicar encapsulamento
      É interessante fornecer acesso apenas ao que é necessário em nossas classes
      O encapsulamento torna o uso das nossas classes mais fácil e intuitivo
-acoplamento
      ação de acoplar. agrupamento aos pares
      acoplar = 2 componentes que estao interligados entre si, causando dependencia entre eles
      ex.: uma classe que faz a utilização de outra classe
            classe A que chama a classe B
            o fato da classe A estar utilizando a B ja gera um acoplamento
            o acoplamento nao é necessariamente ruim
            o problema é quando tem um acoplamento muito forte
            nao da pra nao ter acoplamentos
            na oo temos varias classes no projeto e uma classe tem que conversar com a outra
            o problema é quando a conversa fica mt intima, a classe conhece detalhes demais da outra, isso causa uma dependencia mt       forte e qlqr mudança que tenha na        classe b pode gerar um impacto na classe a e todas as outras que chamem a b
      Acoplamento é a dependência entre classes
      Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento
      Devemos controlar o nível de acoplamento na nossa aplicação
      Algumas classes precisarão de outras, para que não tenham muitas responsabilidades. Cabe a nós medir quando faz sentido adicionar tal acoplamento com as dependências        e como depender do que é seguro, ao invés de classes concretas.


# SOLID
Single responsability principle
      principio da responsabilidade unica
      just because you can, doesnt mean you should
      só pq vc pode ter o sistema inteiro em uma unica classe nao significa que deveria ser assim
            fere a coesao
            codigo gigantesco
            dificil de dar manutencao
            encontrar as coisas
            codigo duplicado
      uma classe deveria ter apenas um unico motivo para mudar - uncle bob
Open closed principle
      principio do aberto fechado
      voce nao precisa fazer uma cirurgia de peito aberto para colocar um casaco
      em vez de toda nova validacao adicionar na mesma classe, extrair usando interfaces e polimorfismo para tornar a classe mais extensivel, mais flexivel
      e para de ficar mexendo em uma classe ja existente
      pq é perigoso
      Entidades de software (classes, modulos, funcoes, etc) devem estar abertas para extensao, porem fechadas para modificação
      Garantir que cada ação/responsabilidade esteja na classe correta
      Que cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
      um sistema deve ser aberto para a extensão, mas fechado para a modificação
      devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes
      Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração.
Liskov substitution principle
      principio da substituição de liskov
      subtipos devem ser substituíveis por seus tipos base sem afetar a corretude do programa. Isso implica que uma classe derivada (subclasse) deve ser usada em qualquer lugar onde sua classe base (superclasse) é usada, sem causar comportamentos inesperados.
      it looks like a duck, quacks like a duck, but needs battery
      you probably have the wrong abstraction
      Qual seria uma alternativa quando a herança não fizer sentido? composicao
      embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
      o Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.
Interface segregation principle
      principio da segregacao de interface
      you want to plug this in, where?
      ao separar as interfaces, implementamos o Interface Segregation Principle
      Uma classe não deve ser obrigada a implementar um método de determinada interface, se ele não será útil. Para isso, uma interface deverá ser extraída apenas com os métodos necessário
      uma classe nao deveria ser forçada a depender de metodos que nao utilizara
      é mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
      Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
Dependency inversion principle
      principio da inversao de dependencia
      would you solder a lamp directly to the eletrical wiring in a wall?
      abstrações nao devem depender de implementações
      implementações devem depender de abstrações
      depender de interfaces e não de implementações
      Caso uma determinada implementação mude, não seremos afetados, pois dependemos apenas de sua interface.
      Se um método muda a forma como realiza sua tarefa, desde que a interface se mantenha, não vamos precisar nos preocupar nem em editar o nosso código.
      implementações devem depender de abstrações e abstrações não devem depender de implementações;
      Que as interfaces devem definir apenas os métodos que fazem sentido para seu contexto;

tell, dont ask
fail fast
