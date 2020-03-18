# language: pt
Funcionalidade: Fazer compra de um produto

  @CompraSucesso
  Cenario: Efetuar a compra com sucesso
    Dado que estou logado no advantagedemo
    Quando eu escolher um topico
    E clicar em um produto
    Entao efetuar a compra

  @CompraFalha
  Cenario: Não efetuar compra
    Dado que estou logado no advantagedemo
    Quando eu escolher um topico
    E clicar em um produto
    Entao nao efetuar a compra
  