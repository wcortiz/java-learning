# 01 - Payment System

![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)
![Frameworks](https://img.shields.io/badge/Frameworks-None_(Vanilla)-lightgrey)
![Pattern](https://img.shields.io/badge/Pattern-MVC-blue)
![Principles](https://img.shields.io/badge/Design-SOLID_Principles-blue)

![Status](https://img.shields.io/badge/Status-In_Progress-yellow)

A clean-architecture payment processing system built in Java.

## Table of Contents

- [Features](#features)
- [Exercise Brief](#exercise-brief)
- [Technologies](#technologies)
- [Project Structure](#project-structure)
- [Diagrams](#diagrams)
    - [Use Case Diagram](#use-case-diagram)
    - [Activity Diagram](#activity-diagram)
    - [Class Diagrams](#class-diagrams)
- [Patterns and Principles Applied](#patterns-and-principles-applied)
- [Author](#author)

## Exercise brief

> <hr>
>  
> ### Context
> 
> An e-commerce platform requires a system to process payments.
> At present, it only accepts card payments, but the business intends to introduce additional payment methods in the future.
> 
> ### Initial Requirements
> 
> - A customer must be able to make a payment.
> - Each payment must include:
>     - Identifier
>     - Amount
>     - Date
>     - Status
> - The system must support card payments.
> 
> 
> ### New Requirements
> 
> The business has requested the following enhancements:
> 
> - Add support for payments made via:
>     - PayPal
>     - Bank transfer
>     - Cryptocurrency
> - Record additional information depending on the payment method used.
> - Allow payments to be cancelled.
> - Introduce an audit system to log payment operations.
> 
> 
> ### Objective
> 
> Design a system in which adding new payment methods does not require modifications to the core application.  
> <hr>

## Technologies

- Java 21 
- Without frameworks (pure Java)

Built using pure Java without external dependencies.

## Project Structure

- `application/` — application entry point and initialization components
- `model/` — domain entities and business concepts
- `service/` — application logic and payment processing services
- `infrastructure/` — external integrations and technical implementations
- `view/` — user interface components for input and output handling
- `controller/` — coordinates user interactions and application flow

```
src/
└── dev/wcortiz/paymentsystem/
    ├── Main.java
    ├── controller/
    │   └── PaymentController.java
    ├── infrastructure/
    │   ├── CreditCardGateway.java
    │   └── FakeCardGateway.java
    ├── model/
    │   ├── Payment.java
    |   └── PaymentStatus.java
    ├── service/
    │   ├── CreditCardMethod.java
    │   ├── PaymentMethod.java
    │   ├── PaymentRequestDto.java
    |   ├── PaymentResponseDto.java
    |   ├── PaymentService.java
    |   └── PaymentServiceImpl.java
    └── view/
        ├── InputView.java
        ├── InputConsola.java
        ├── OutputView.java
        └── OutputConsola.java
```

## Diagrams

### Use Case Diagram

Interactions between the customer and the system, covering all supported payment operations.

![Use Case Diagram](./docs/diagrams/01-use-case-diagram/use-case-diagram.png)

> **Resources:** 
[`PlantUML source`](./docs/diagrams/01-use-case-diagram/use-case-diagram.puml) · 
[`Edit online`](https://www.plantuml.com/plantuml/uml/LOzD2i8m48NtSuf7zbruWq8zW51wWA4POo0_aamNHGGFuGazYObTkNamy7t3UsDLBhh5WAtAi78BwzaLZaH1hWhDADxT5DONMTNdHAHUWs2fWebRd0y1dzSR5zwZ9CMyLvL8nAlcqj52r7rEhgdc7pDu481UeJU0cIKq5ddJsWphayFzCAe1LopJYPv4_Is6uNVIACcs7Ly0) · 
[`Descriptive sheets (PDF)`](./docs/diagrams/01-use-case-diagram/descriptive-sheets/use-case-sheets.pdf)

### Activity Diagram

Flow of the payment processing operation, including validation, processing, and error handling.


![Activity Diagram](./docs/diagrams/02-activity-diagram/activity-diagram.png)

> **Resources:** 
[`PlantUML source`](./docs/diagrams/02-activity-diagram/activity-diagram.puml) · 
[`Edit online`](
    https://www.plantuml.com/plantuml/uml/XLFTRjCm5BxtKtmA5sqlHWVSqMciR1HnWJJHyG1kSjfOTUnYdwogA18FmHFo93X9qth8tSvLhFFzdC_nkV4i7TULXinPFIhUNHHAhfoiX1WFBfA5EUyqUIHQWx4GVgtCHWO5pBUgqjBGWs9DCsku9M9XTH6XfWVZZp9VhvojJN5hjNLuDGjrUvb2MbUGEw8kGyKev-pseLJvsf3tUFFwxLc96FNk_y2OMOTxwnKhQvHPuPEcYWnxd0tSto5-2Y2QykfAcKVbrKBJzJMsfM9g077WDEZNkR-0ko_Jpz-cNv5gDaDnS-V8-houw_ug_lx-WtkvQu9WllDCLIR4lllQXw_ldjmUedqMGZZQa6I1KE_XILFEo6pDeMsAvausdPJF9g95zKheEQNTGcgD50biiI1Kig03NIqnv98SGJfASZwC4006GsD7BQNpKG6LIwRGb8oJXB5fDuGYxGd37VcJK1U_EyQPWs2lSvHPzqD7kJjg55sPfNMLR9uGv284YgKcuaNZBFWSyTdpXev-rEIV3biHbxPePguzlUYNugOzq_SUixVImzTvJjulQnsfUBQRqsayY5UC3Yis69yy9dYw6STEGIppiZrI66CfH9IiUxdD6cd2S3GHDm5JL_eV
)

### Class Diagrams

#### Conceptual Class Diagram

Overview of the business domain entities and their relationships, independent of any technical implementation.

![Conceptual Class Diagram](./docs/diagrams/03-class-diagrams/conceptual-class-diagram/conceptual-class-diagram.png)

> **Resources:** 
[`PlantUML source`](./docs/diagrams/03-class-diagrams/conceptual-class-diagram/conceptual-class-diagram.puml) · 
[`Edit online`](
    https://www.plantuml.com/plantuml/uml/VL1TRvj047o_Nx4Y3v4gOINAMrLLmPWeg3OWmn_Otctj4t27xkF1RVFVImuZ6cHbdcwP7MPcdwr3utpV0TUAq-0yTZ7lqDfOI3mPx1cxZoV0QxxB8DjdXwneoXgIOWVrZxoeacDoW7Z6FMEsbMh0KGpXLubpHlxqZlBHf9Q_2HxMArjj19dcB7cho5fut3mnTfQ2e2Ttri9E0vU6TxH4cW1fkI-FiCjUyY9lyhAuXlaa4lnXC6ABl3qPxPL8TQSDtBq4J5o8D7r_nzrJ07jRsSyNgJyFCDbMUEb9kQizzgEr2q-1ZiB3EdJUihULuX3ESDKfx6dPI0q9wL8quZzDXTqyRL6rZK5bVv5PD9V1QUwD8SKlwuF6SCpsoNkH-ZMlwdMRq6Tk4ZriDbyYq77y7QB7Q9NtAqWBWz6Sh2K1tafrOkpZphU_e-5IuXOx5Rh1V2XtYryNVIObVD_z0m00
)

#### Implementation Class Diagram

Detailed view of the application's technical implementation, showing the MVC architecture, service layer, payment method strategies, infrastructure components, and the relationships between interfaces and concrete implementations.

![Implementation Class Diagram](./docs/diagrams/03-class-diagrams/implementation-class-diagram/implementation-class-diagram.png)

> **Resources:** 
[`PlantUML source`](./docs/diagrams/03-class-diagrams/implementation-class-diagram/implementation-class-diagram.puml) · 
[`Edit online`](
    https://www.plantuml.com/plantuml/uml/bLLTRzis57tNho3S1syOx3PhFb8ZCEf8SYV0iGpPoJ0CUs2bQuU8H7eabSneyjydCeeeaNAtwaaIppttyfxBmyz2OYxB8lVkIGP8IE30v64FdZSSMG_ouqLycwnH4CwZPRI9uYKQES_GyyG3eNlCSO7I70k1ldceUgvn-h3ZhAIPptB6hwvIHYLdUGvyEaNlWbbuEVTVaOndmFjGwdbt_l7oP3Rt-aaV2JnfkhFmCZYrwCow9he8PlxvhqU82fP1hfZcy_0iT9WCG5DTNvwTddquGYM0Fv8K5Dbsk_sOPYwPWMYwzFGJ_d2CZiEU2I8PFzJbdVjMtnoK9WqkFbqV9ILqox6Gl4nboNMfuKdLmmk7s47MecpFJYvIxyNh6vnm4Tw4oyr_JyxmBWf_Hpa-0A--zbMHU0Tee4GRr6D4g0I-nIcWYEvBULSjeJTPFS-2nALqC0fI3wPcy1aLBCSDGEMfdn42AZdEy0IjKqmfSBtqqk9GAGo9bUNzSAKq88mIkaEGGr7nYU7xLlYi_8Va17Ea_wb3sFnIpHpUn46uS3kYXq-rn32jy47H8pEPxOrKn5IIBG4-GRUtKT1QmWKhgPoWQx8B82K5pbkB6POmGGkMuZoeNbihGc9PYibRthN-RDQRbrzGoefz3X9--dc27Xd9Maj4h81cLNFKsbV6Si2qi-pNiPaDg3K0MXRT2dhtlmgNGRJyqdpxySrg4Mx2eEPIdKx2LRoEDd7oXzjkSvZSCQop9mq4jGzVT-0SR5HjpyQhOjPXSXVveLj9RHH7orY_hgEMfLZv3QXERe3zb3SWxrbcW9tExa0kSQ6rNKjUAUcU49z3HgIFUUOmzJT7x1aL44ZMHlO1_ov1I1kdskV7oqqIBnPXudRGN2YzvyTlbf5r-NnhJoObAS7SZ7GpHj5odipMc-JMtzmcFG9sxTFLqNJh2vRmX0_8jTnMrNFy0Dy7wwfYUGzSL7MykOvaViu4uAyvw1BqGLL_cYszE4wEvd62r25H1buT9-FhhfCRSnxzMRbQ1lIlZ3tHaN6tjnSRO3pRynnD33Y7hMonULqJi3YTYVbH-FSgAVSZomIFiNEokvSDk84v0CScb1JkWv9mCLDQh7-BLhO8vavLhLIAj2-xSRaVFq-xSz0MxUfvh1eyHkqepqXZ09txhyw6CCsGQTMmhts3am4QQH6d-jtadYY_nPaO78jI8jLHAhi9U-94GXNd3Mk7KvbTinWhWh7jc3fj2kHHCLXhhn7JFelIORBaj8gombIJjABZ7kFrt5-eHayjvwrIb08CV_tVq3iMQphmVwHGmp1rXrxbJJbW2SUbqFbhBTn-bg8_rEpJwQS9wsxXHjtfGw-tQ-toLNo1ATwzKfWZP6BDFqiWvsQsQkWZSmfncTfRYZhcND7qsFspuh6DtIh5uR4dmFJOpQ1qPKLHKf8gST4JaVS3xpFGh2poVm40
)

## Patterns and Principles applied

- MVC pattern
- SOLID principles
- Service layer with rich model

## Author

Developed by **Wilson Camilo Ortiz Miño**

[![GitHub](https://img.shields.io/badge/GitHub-181717?logo=github&logoColor=white)](https://github.com/wcortiz)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/wilson-camilo-ortiz-mi%C3%B1o-b88282419/)