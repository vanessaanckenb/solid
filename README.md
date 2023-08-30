# SOLID

</br></br>

Principios da Orientação a Objetos
</br></br>
-coesão
</br>
uniao harmonica entre uma coisa e outra</br>
classes não coesas tendem a crescer indefinidamente, o que as tornam dificeis de manter</br>
Cada classe deve ser responsável por apenas uma coisa, e deve executar esta tarefa muito bem</br>
Classes coesas não devem ter várias responsabilidades
</br></br>
-encapsulamento
</br>
incluir ou proteger algo em uma capsula</br>
classes nao encapsuladas permitem violação de regras de negocio, alem de aumentarem o acoplamento</br>
forma de manter os objetos das nossas classes protegidos, fornecendo apenas o que é estritamente necessário para o mundo exterior</br>
colocar private</br>
Ao encapsular o acesso a determinados dados, liberando acesso apenas ao necessário, os objetos da nossa classe se tornam mais fáceis de serem utilizados.</br>
e nao colocar setter em tudo</br>
senao qlqr pessoa pode mexer sem regras</br>
criar getters e setters para tudo quebra o encapsulamento da nossa classe.</br>
geralmente a falta de encapsulamento gera um acoplamento maior</br>
Getters e setters não são formas eficientes de aplicar encapsulamento</br>
É interessante fornecer acesso apenas ao que é necessário em nossas classes</br>
O encapsulamento torna o uso das nossas classes mais fácil e intuitivo</br></br>
-acoplamento
</br>
ação de acoplar. agrupamento aos pares</br>
acoplar = 2 componentes que estao interligados entre si, causando dependencia entre eles</br>
ex.: uma classe que faz a utilização de outra classe</br>
classe A que chama a classe B</br>
o fato da classe A estar utilizando a B ja gera um acoplamento</br>
o acoplamento nao é necessariamente ruim</br>
o problema é quando tem um acoplamento muito forte</br>
nao da pra nao ter acoplamentos</br>
na oo temos varias classes no projeto e uma classe tem que conversar com a outra</br>
o problema é quando a conversa fica mt intima, a classe conhece detalhes demais da outra, isso causa uma dependencia mt forte e qlqr mudança que tenha na classe b pode gerar um impacto na classe a e todas as outras que chamem a b</br>
Acoplamento é a dependência entre classes</br>
Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento</br>
Devemos controlar o nível de acoplamento na nossa aplicação</br>
Algumas classes precisarão de outras, para que não tenham muitas responsabilidades. Cabe a nós medir quando faz sentido adicionar tal acoplamento com as dependências e como depender do que é seguro, ao invés de classes concretas.


</br>
</br>

</h2>SOLID</h2>
</br>
Single responsability principle
</br></br>
principio da responsabilidade unica</br>
just because you can, doesnt mean you should</br>
só pq vc pode ter o sistema inteiro em uma unica classe nao significa que deveria ser assim</br>
fere a coesao</br>
codigo gigantesco</br>
dificil de dar manutencao</br>
encontrar as coisas</br>
codigo duplicado</br>
uma classe deveria ter apenas um unico motivo para mudar - uncle bob</br></br>

Open closed principle
</br>
principio do aberto fechado</br>
voce nao precisa fazer uma cirurgia de peito aberto para colocar um casaco</br>
em vez de toda nova validacao adicionar na mesma classe, extrair usando interfaces e polimorfismo para tornar a classe mais extensivel, mais flexivel
e para de ficar mexendo em uma classe ja existente</br>
pq é perigoso</br>
Entidades de software (classes, modulos, funcoes, etc) devem estar abertas para extensao, porem fechadas para modificação</br>
Garantir que cada ação/responsabilidade esteja na classe correta</br>
Que cada classe deve conhecer e ser responsável por suas próprias regras de negócio;</br>
um sistema deve ser aberto para a extensão, mas fechado para a modificação</br>
devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes</br>
Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração.</br></br>

Liskov substitution principle
</br>
principio da substituição de liskov</br>
subtipos devem ser substituíveis por seus tipos base sem afetar a corretude do programa. Isso implica que uma classe derivada (subclasse) deve ser usada em qualquer lugar onde sua classe base (superclasse) é usada, sem causar comportamentos inesperados.</br>
it looks like a duck, quacks like a duck, but needs battery</br>
you probably have the wrong abstraction</br>
Qual seria uma alternativa quando a herança não fizer sentido? composicao</br>
embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;</br>
o Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.</br></br>

Interface segregation principle</br>
principio da segregacao de interface</br>
you want to plug this in, where?</br>
ao separar as interfaces, implementamos o Interface Segregation Principle</br>
Uma classe não deve ser obrigada a implementar um método de determinada interface, se ele não será útil. Para isso, uma interface deverá ser extraída apenas com os métodos necessário</br>
uma classe nao deveria ser forçada a depender de metodos que nao utilizara</br>
é mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;</br>
Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;</br></br>

Dependency inversion principle
</br>
principio da inversao de dependencia</br>
would you solder a lamp directly to the eletrical wiring in a wall?</br>
abstrações nao devem depender de implementações</br>
implementações devem depender de abstrações</br>
depender de interfaces e não de implementações</br>
Caso uma determinada implementação mude, não seremos afetados, pois dependemos apenas de sua interface.</br>
Se um método muda a forma como realiza sua tarefa, desde que a interface se mantenha, não vamos precisar nos preocupar nem em editar o nosso código.</br>
implementações devem depender de abstrações e abstrações não devem depender de implementações;</br>
Que as interfaces devem definir apenas os métodos que fazem sentido para seu contexto;</br>

</br>
</br>

tell, dont ask</br>
fail fast
