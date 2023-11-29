# Sprint1-JAVA
primeira sprint de 4, inicio do projeto.

# Projeto Salesforce - Acessibilidade para Todos

## Pesquisas

Nossa equipe realizou pesquisas extensivas em diversos sites, incluindo referências notáveis, como o Magazine Luiza, para coletar ideias e insights relacionados à acessibilidade. Através dessas pesquisas, reunimos uma ampla variedade de recursos e funcionalidades para criar um site altamente acessível.

## Escopo do Projeto

O objetivo deste projeto é desenvolver um site de acessibilidade dedicado a pessoas com deficiências visuais, auditivas e à terceira idade. As principais funcionalidades incluirão:

1. **Compatibilidade com Leitores de Tela:** O site será cuidadosamente projetado com marcação semântica adequada para garantir total compatibilidade com leitores de tela populares, como NVDA e JAWS.

2. **Alteração de Contraste de Cores:** Os usuários terão a capacidade de personalizar o contraste das cores do site para atender às suas preferências e necessidades individuais.

3. **Aumento de Elementos na Tela:** Os usuários poderão ampliar o tamanho dos elementos na tela, incluindo texto e imagens, tornando a experiência de leitura mais fácil.

4. **Integração com API do Vlibras:** A página inicial (home page) será integrada com a API do Vlibras para fornecer suporte à Língua Brasileira de Sinais (Libras) e tornar o conteúdo acessível a pessoas com deficiência auditiva.

5. **Chatbot de Comando por Voz:** Implementaremos um chatbot controlado por comandos de voz para auxiliar os usuários nas etapas de cadastro, login e compra de serviços da Salesforce. Isso tornará o site acessível para pessoas com mobilidade reduzida.

6. **Coleta de Feedback dos Usuários com Deficiência:** Após a conclusão do cadastro, incentivaremos os usuários com deficiência a compartilhar suas experiências e fornecer feedback. Essas informações nos ajudarão a identificar áreas de melhoria e aprimorar continuamente a experiência do usuário.

## Tecnologias Utilizadas

- **Front-End:** Utilizaremos HTML, CSS e JavaScript para desenvolver uma interface de usuário responsiva e altamente acessível.
- **Back-End:** Java e Python serão empregados para o gerenciamento de lógica do lado do servidor.
- **API do Vlibras:** Integraremos a API do Vlibras para fornecer suporte à Língua Brasileira de Sinais (Libras).
- **Tecnologias de Voz:** Utilizaremos tecnologias de fala e reconhecimento de voz para o chatbot controlado por voz.

## Implementação

- **Desenvolvimento Responsivo:** O foco será na criação de uma interface de usuário responsiva que atenda a padrões de acessibilidade.
- **Desenvolvimento Web Acessível:** Implementaremos práticas recomendadas, incluindo o uso de ARIA (Accessible Rich Internet Applications), para tornar o site verdadeiramente acessível.
- **Integração com Vlibras:** A integração da API do Vlibras na página inicial garantirá suporte à Libras.
- **Chatbot Controlado por Voz:** Desenvolveremos um chatbot que pode ser comandado por voz, tornando o site acessível a pessoas com mobilidade reduzida.
- **Feedback dos Usuários:** Coletaremos feedback dos usuários com deficiência para identificar áreas de melhoria contínua.

## Classes Java

Atualmente, o projeto conta com sete classes principais: Main, Util, Usuario, UsuarioPCD, UsuarioComum, Acessibilidade e Produto. O código está organizado de forma a permitir uma clara estrutura e extensibilidade das funcionalidades relacionadas a usuários, acessibilidade e produtos.

### Classe Main

A classe Main será utilizada somente para chamar a classe Util, que contém a maior parte do código. Na classe Util, implementaremos um switch case para permitir que os usuários escolham suas ações e, futuramente, incorporaremos uma interface gráfica para melhorar a experiência visual.

## Como Utilizar

1. **Tela Gráfica**: O software apresenta uma interface gráfica amigável, na qual os usuários podem escolher as opções desejadas. Após selecionar uma opção, o software os direcionará para o local apropriado.

2. **Cadastro de Usuário**:
   - Escolha a opção de cadastro.
   - Forneça os dados solicitados.
   - Confirme o cadastro.

3. **Login**:
   - Selecione a opção de login.
   - Insira seu email e senha.
   - Efetue o login.

4. **Compra de Produtos**:
   - Explore os produtos disponíveis.
   - Selecione um produto.
   - Escolha a quantidade e compre.

5. **Cancelar Compra**:
   - Se você desejar cancelar uma compra, selecione a opção apropriada.
   - Especifique a quantidade de produtos a serem devolvidos ao estoque.

6. **Acessibilidade**:
   - Explore as opções de acessibilidade para personalizar sua experiência.

7. **Feedback**:
   - Após o cadastro ou uso do software, encorajamos os usuários com deficiência a fornecer feedback sobre sua experiência. Suas opiniões são valiosas para a melhoria contínua.

## Equipe de Desenvolvimento

- Desenvolvedor: Paulo Sérgio Caetano
- Analistas de Requisitos: Sabrina Couto, Thais Ribeiro

Este projeto tem como objetivo tornar o site Salesforce altamente acessível, garantindo que ele seja inclusivo para pessoas com deficiências visuais, auditivas e mobilidade reduzida. A coleta de feedback dos usuários com deficiência desempenhará um papel fundamental na melhoria contínua da acessibilidade.
