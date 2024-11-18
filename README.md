# Omnira - Sistema de Gestão ERP Modular

## Descrição do Projeto

Esse é um sistema de gestão empresarial (ERP) modular projetado para atender às necessidades específicas de controle de estoque e controle de ponto. Com uma interface amigável e recursos robustos, o Omnira visa facilitar a administração de processos internos, proporcionando eficiência e agilidade para empresas de diversos segmentos.

## Funcionalidades Principais

- **Controle de Estoque**: Gerencie produtos, acompanhe entradas e saídas, e mantenha registros precisos das quantidades disponíveis em tempo real.
  
- **Controle de Ponto**: Registre a presença dos funcionários, gerencie horários e gerencie informações relacionadas ao tempo de trabalho.

- **Interface Intuitiva**: Uma tela inicial atraente que permite aos usuários navegar facilmente entre os diferentes módulos do sistema.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal para o desenvolvimento do backend.
- **Spring Boot**: Framework utilizado para criar aplicações web de forma rápida e eficiente.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional usado para armazenar dados.
- **HTML, CSS, JavaScript**: Tecnologias de frontend utilizadas para criar uma interface de usuário responsiva e amigável.

## Estrutura do Projeto

O projeto é estruturado em várias pastas, organizadas da seguinte forma:

- `back/src/main/java/com/omnira`: Contém os pacotes do backend, incluindo:
  - **configuration**: Configurações do aplicativo.
  - **domain**: Definições de entidades e modelos de dados.
  - **service**: Lógica de negócio e serviços do sistema.
  - **controller**: Controladores responsáveis pela interação com o frontend.

- `back/src/main/resources`: Contém recursos estáticos e templates, como folhas de estilo CSS e arquivos HTML.

- `database`: Contém scripts para a criação e inicialização do banco de dados PostgreSQL.
  - **schema.sql**: Script para a criação das tabelas no banco de dados.
  - **data.sql**: Script para a inserção de dados iniciais no banco de dados.

- `front`: Contém o código do frontend, com tecnologias como HTML, CSS e JavaScript para a construção da interface do usuário.
