# PROJETO: Modelagem de Dados UML (Análise & Projeto Orientado a Objetos)
Projeto desenvolvido durante o final do curso de modelagem de dados com UML. Trata-se de uma implementação de um um modelo conceitual 
sobre o paradigma orientado a objetos, usando padrões de mercado e boas práticas. 

-----------------------------------------------------------------------------------------------

## Modelo Conceitual 
<img width="1648" height="878" alt="Image" src="https://github.com/user-attachments/assets/2cdc2ce8-93fd-4fa9-a71d-17213a1fdc0b" />
 
-----------------------------------------------------------------------------------------------

## Instâncias 
<img width="1970" height="661" alt="Image" src="https://github.com/user-attachments/assets/62bdb8b7-0d1d-48f1-8262-905c340f12b6" />
 
 -----------------------------------------------------------------------------------------------
 
## Objetivos Específicos
- Fazer uma implementação padrão de um modelo conceitual
- Criar instancias a partir do modelo conceitual
- Gerar uma base de dados relacional automaticamente a partir do modelo
- Povoar o banco de dados a partir das instancias propostas
- Recuperar os dados e disponibilizá-los por meio de uma API Rest básica

-----------------------------------------------------------------------------------------------

## Tecnologias Utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- H2 (Banco de Dados )
- Postman (teste de API)
- Maven

-----------------------------------------------------------------------------------------------
## Funcionalidades
- Recuperar dados da Categoria e seus produtos
  
End point : ``` localhost:8082/categorias/{id}```
```json
 {
    "id": 1,
    "nome": "Informática",
    "produtos": [
        {
            "id": 1,
            "nome": "Computador",
            "preco": 2000.0
        },
        {
            "id": 2,
            "nome": "Impressora",
            "preco": 800.0
        },
        {
            "id": 3,
            "nome": "Mouse",
            "preco": 80.0
        }
    ]
}
```

- Recuperar dados do Cliente

End point : ``` localhost:8082/clientes/{id} ```

```json
{
    "id": 1,
    "nome": "Maria Silva",
    "email": "maria@gmail.com",
    "cpfOuCnpj": "36378912377",
    "tipo": "PESSOAFISICA",
    "enderecos": [
        {
            "id": 1,
            "logradouro": "Rua Flores",
            "numero": "300",
            "complemento": "Apto 303",
            "bairro": "Jardim",
            "cep": "38220834",
            "cidade": {
                "id": 1,
                "nome": "Uberlândia",
                "estado": {
                    "id": 1,
                    "nome": "Minas Gerais"
                }
            }
        },
        {
            "id": 2,
            "logradouro": "Avenida Matos",
            "numero": "105",
            "complemento": "Sala 800",
            "bairro": "Centro",
            "cep": "3877012",
            "cidade": {
                "id": 2,
                "nome": "São Paulo",
                "estado": {
                    "id": 2,
                    "nome": "São Paulo"
                }
            }
        }
    ],
    "telefones": [
        "27363323",
        "93838993"
    ]
}
```

- Recuperar dados do Pedido

End point: ``` localhost:8082/pedidos/{id} ```

```json
{
    "id": 1,
    "instante": "30/09/2017 01:32",
    "pagamento": {
        "id": 1,
        "estado": "QUITADO",
        "numeroDeParcelas": 6
    },
    "cliente": {
        "id": 1,
        "nome": "Maria Silva",
        "email": "maria@gmail.com",
        "cpfOuCnpj": "36378912377",
        "tipo": "PESSOAFISICA",
        "enderecos": [
            {
                "id": 1,
                "logradouro": "Rua Flores",
                "numero": "300",
                "complemento": "Apto 303",
                "bairro": "Jardim",
                "cep": "38220834",
                "cidade": {
                    "id": 1,
                    "nome": "Uberlândia",
                    "estado": {
                        "id": 1,
                        "nome": "Minas Gerais"
                    }
                }
            },
            {
                "id": 2,
                "logradouro": "Avenida Matos",
                "numero": "105",
                "complemento": "Sala 800",
                "bairro": "Centro",
                "cep": "3877012",
                "cidade": {
                    "id": 2,
                    "nome": "São Paulo",
                    "estado": {
                        "id": 2,
                        "nome": "São Paulo"
                    }
                }
            }
        ],
        "telefones": [
            "27363323",
            "93838993"
        ]
    },
    "enderecoDeEntrega": {
        "id": 1,
        "logradouro": "Rua Flores",
        "numero": "300",
        "complemento": "Apto 303",
        "bairro": "Jardim",
        "cep": "38220834",
        "cidade": {
            "id": 1,
            "nome": "Uberlândia",
            "estado": {
                "id": 1,
                "nome": "Minas Gerais"
            }
        }
    },
    "itens": [
        {
            "desconto": 0.0,
            "quantidade": 1,
            "preco": 2000.0,
            "produto": {
                "id": 1,
                "nome": "Computador",
                "preco": 2000.0
            }
        },
        {
            "desconto": 0.0,
            "quantidade": 2,
            "preco": 80.0,
            "produto": {
                "id": 3,
                "nome": "Mouse",
                "preco": 80.0
            }
        }
    ]
}
```
