# Sistema de Gestão de Almoxarifado e Ordens de Produção

Sistema pessoal para digitalizar o controle de Ordens de Produção (OPs) e do Almoxarifado em empresas do setor industrial que fabricam produtos sob encomenda para clientes corporativos.

Atualmente, em muitas empresas desse tipo, esses processos ainda são feitos de forma manual: as OPs circulam em papel entre os setores da fábrica e o controle de materiais é feito em planilhas Excel com PROCV. Isso gera perda de rastreabilidade, dificuldade em saber o status/localização de uma OP, e retrabalho na separação de materiais no almoxarifado.

Este projeto nasceu como estudo pessoal de engenharia de software e também como projeto de portfólio, inspirado em desafios reais observados no dia a dia de operações de produção e almoxarifado, sem vínculo com nenhuma empresa específica. É desenvolvido em ritmo próprio, sem prazo definido.

## Objetivo

Substituir o fluxo manual por um sistema digital que permita:

- Cadastrar e acompanhar Ordens de Produção do pedido até a expedição
- Rastrear a passagem da OP por todos os setores de produção, com login próprio para cada líder de setor
- Sugerir automaticamente os materiais de cada OP a partir de templates pré-cadastrados por tipo de pedido, com validação da Engenharia antes da confirmação
- Registrar substituições de material por falta de estoque (código/nome do material substituto)
- Dar visibilidade sobre o status de cada OP, evitando que se "perca" entre os setores

## Processo atual (AS-IS) — resumo

- OPs são criadas pela Engenharia a partir de pedidos de clientes, seguindo padrões de produção já conhecidos
- A folha da OP traz código, pedido do cliente, materiais, setor de destino e quantidade — a data de entrega é anotada manualmente
- A ordem entre os setores (Corte e Dobra, Acrílico, Montagem, Preparação, Pintura, Serralheria) varia por OP e é decidida junto com os líderes
- A folha física circula entre os setores sem controle digital, o que causa atrasos, "perda" temporária da OP e entrega de materiais fora de ordem
- O almoxarifado entrega os materiais aos setores sem reorganização prévia, perdendo tempo para separar o que pertence a cada um
- Controle de estoque é manual, com contagens pontuais pedidas pela Engenharia
- Volume médio: mais de 50 OPs por mês

## Escopo do MVP

O foco é um MVP enxuto, sem funcionalidades de financeiro, compras completas, ERP ou aplicativo mobile.

- Cadastro de Setores, Usuários (login por líder de setor), Templates de materiais e Ordens de Produção
- Avanço de status da OP entre setores (`AguardandoSeparacao` → `EmProducao` → `EmExpedicao` → `Concluida`)
- Sugestão automática de materiais por template, com ajuste/validação da Engenharia
- Registro de substituição de material por falta de estoque
- Autenticação simples (sem Spring Security nesta fase)

## Modelagem

- **Casos de uso, diagrama de classes e diagrama de estados** definidos na fase de modelagem UML
- Entidades principais: `Usuario`, `Setor`, `Template`, `ItemTemplate`, `OrdemProducao`, `ItemOP`, `Movimentacao`
- Banco de dados relacional com as tabelas: `setor`, `usuario`, `template`, `item_template`, `ordem_producao`, `item_op`, `movimentacao`
- IDs modelados como `Long`, seguindo padrão de mercado

## Tecnologias

| Camada       | Tecnologia                                  |
|--------------|----------------------------------------------|
| Backend      | Java + Spring Boot (Spring Data JPA)          |
| Banco de dados | MySQL                                       |
| Frontend     | HTML, CSS e JavaScript                        |
| Documentação | UML (Mermaid)                                 |
| Versionamento| Git / GitHub                                  |

## Fases do projeto

1. Entender o problema (AS-IS)
2. Mapear o processo atual
3. Definir o processo futuro (TO-BE)
4. Definir MVP / V2 / evoluções futuras
5. Modelagem UML ✅
6. Modelagem do banco de dados ✅
7. Backend (em andamento)
8. Testes
9. Frontend
10. Testes
11. Implantação
12. Evolução

## Status atual

Projeto em desenvolvimento na fase de **backend**, com o projeto Spring Boot já criado e publicado no repositório.

## Como rodar (em construção)

> Instruções de configuração e execução serão adicionadas conforme o backend avançar.

```bash
# Clonar o repositório
git clone https://github.com/Rochasg7/Sistema-Gestao-Operacional.git

# Entrar na pasta do projeto
cd Sistema-Gestao-Operacional

# Rodar com Maven
./mvnw spring-boot:run
```

## Autor

Projeto pessoal desenvolvido por **Gabriel de Souza Rocha** e **Jorge Ricardo de Carvalho Simões**, estudantes de Sistemas de Informação (UNIVAS), como estudo de engenharia de software e projeto de portfólio.