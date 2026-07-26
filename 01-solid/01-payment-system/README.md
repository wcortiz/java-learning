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
[`Edit online`](https://www.plantuml.com/plantuml/uml/XLFTRjCm5BxtKtmA5sqlHWVSqMciR1HnWJJHyG1kSjfOTUnYdwogA18FmHFo93X9qth8tSvLhFFzdC_nkV4i7TULXinPFIhUNHHAhfoiX1WFBfA5EUyqUIHQWx4GVgtCHWO5pBUgqjBGWs9DCsku9M9XTH6XfWVZZp9VhvojJN5hjNLuDGjrUvb2MbUGEw8kGyKev-pseLJvsf3tUFFwxLc96FNk_y2OMOTxwnKhQvHPuPEcYWnxd0tSto5-2Y2QykfAcKVbrKBJzJMsfM9g077WDEZNkR-0ko_Jpz-cNv5gDaDnS-V8-houw_ug_lx-WtkvQu9WllDCLIR4lllQXw_ldjmUedqMGZZQa6I1KE_XILFEo6pDeMsAvausdPJF9g95zKheEQNTGcgD50biiI1Kig03NIqnv98SGJfASZwC4006GsD7BQNpKG6LIwRGb8oJXB5fDuGYxGd37VcJK1U_EyQPWs2lSvHPzqD7kJjg55sPfNMLR9uGv284YgKcuaNZBFWSyTdpXev-rEIV3biHbxPePguzlUYNugOzq_SUixVImzTvJjulQnsfUBQRqsayY5UC3Yis69yy9dYw6STEGIppiZrI66CfH9IiUxdD6cd2S3GHDm5JL_eV)

### Class Diagrams

#### Conceptual Class Diagram

Overview of the business domain entities and their relationships, independent of any technical implementation.

![Conceptual Class Diagram](./docs/diagrams/03-class-diagrams/conceptual-class-diagram/conceptual-class-diagram.png)

> **Resources:** 
[`PlantUML source`](./docs/diagrams/03-class-diagrams/conceptual-class-diagram/conceptual-class-diagram.puml) · 
[`Edit online`](https://www.plantuml.com/plantuml/uml/VP1HQzim58NVzIikwKDXuD3Ijp567SUbPeaJulo1M_ak4P6bS7N5oBR-zxgsGuW9FK-opv7EuNiEWYoniQ2zqtIKY3RH5aD8QeCxnaQf-wGNl1Rp7F95lipBxQg2j9n3zQier-acNK9orhrIuM3S4TlBq3sLYh1vYq95MrAPlmGFuyZCSqsytHjzS1G2F4wVbDgRcg0XsViwz1_QiBPqcTGBijLYjO5v_bAKnRPObSEOBoR1FmMjPgWFE_RHrPctdk7kfLFlTPFw_v-wU-gataVrPoBLrmFwsZMU6d8or6FJLajth56eEmH1YK6zZsuiEmp3FOSDNH8PKsqaGpxRkZsMiNaZxZx5IBJ8Lq-kqGvXQj3OYpT3TzWokl2RU4WKixIy_L36fwDu7Pd9wTCG_uFMaimDanRZNRzeY8pXjO9DlaW_cLMlnReQWUlHdQ5D7gRJRnFmIV8J9e-J4PhlO08SsMiAWMg8mRYTKjUP7__RmWkl6-u0vuPpXUQ6FwAXr3EvEZRs0m00)

## Patterns and Principles applied

- MVC pattern
- SOLID principles
- Service layer with rich model

## Author

Developed by **Wilson Camilo Ortiz Miño**

[![GitHub](https://img.shields.io/badge/GitHub-181717?logo=github&logoColor=white)](https://github.com/wcortiz)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/wilson-camilo-ortiz-mi%C3%B1o-b88282419/)