# Cadastro de Usuário com Tratamento de Exceções

Programa em Java que simula o cadastro de usuários, validando a idade mínima com uma exceção personalizada.

## Como funciona

1. O usuário informa nome e idade.
2. Se a idade for menor que 18 anos, o sistema lança a exceção `IdadeInvalidaException`.
3. Se a idade for válida, o usuário é cadastrado com sucesso.
4. O bloco `try/catch/finally` trata o erro e sempre exibe a mensagem final do processo.

## Arquivos

- `CadastroUsuario.java` — classe principal, com o método `main` e o método `cadastrarUsuario`.
- `IdadeInvalidaException.java` — exceção personalizada usada na validação de idade.

## Como executar

```bash
javac IdadeInvalidaException.java CadastroUsuario.java
java CadastroUsuario
```

## Exemplo de uso

```
Digite o nome do usuário: Maria
Digite a idade do usuário: 20
Usuário Maria, foi cadastrado com sucesso.
Processo de cadastro finalizado.
```

```
Digite o nome do usuário: João
Digite a idade do usuário: 15
Erro ao cadastrar usuário: O usuário precisa ser maior de idade para se cadastrar.
Processo de cadastro finalizado.
```
