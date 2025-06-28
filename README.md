# Restaurante App 🍔

Aplicativo Android desenvolvido em Kotlin para apresentação de cardápio de um restaurante (inspirado no Outback).

## Funcionalidades

- Tela principal com imagem de capa e logo
- Seções:
  - Destaques (produtos em destaque com imagem e preço)
  - Produtos (com nome, descrição, valor e imagem)
- Navegação para tela de detalhes do produto

## Tecnologias Utilizadas

- [x] Kotlin
- [x] Android Studio
- [x] ConstraintLayout
- [x] Intent para navegação entre telas

## Como executar

```bash
git clone https://github.com/SEU_USUARIO/Restaurante.git
cd Restaurante
```

Abra o projeto no **Android Studio** e execute em um emulador ou dispositivo físico.

## Estrutura do Projeto

```
Restaurante/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/restaurante/
│   │   │   │   ├── RestauranteActivity.kt
│   │   │   │   ├── Constants.kt
│   │   │   │   └── DetalhesProdutoActivity.kt (ainda será criado)
│   │   │   └── res/
│   │   │       ├── layout/
│   │   │       │   └── activity_restaurante.xml
│   │   │       ├── drawable/
│   │   │       └── values/
```

## Branch atual

```bash
feature/detalhes_restaurante
```

## Pull Request

### 📌 PR: Tela de Detalhes do Restaurante

> **Branch de origem:** `feature/detalhes_restaurante`  
> **Destino:** `main`

### Descrição:

- Estrutura inicial da tela principal do restaurante
- Implementação dos cards de destaques e produtos
- Listener configurado para o card "Big Five" com dados passados via Intent
- Navegação para a futura `DetalhesProdutoActivity`

👤 **Revisor solicitado**: Membro 4
