This is an example page that has a mermaid diagram. Just so you can see how it looks.
```mermaid
%%{init: {'theme': 'base'}}%%

graph LR
  A[Start] --> B{Error?};
  B -->|Yes| C[Hmm...];
  C --> D[Debug];
  D --> B;
  B ---->|No| E[Yay!];
```

```mermaid
%%{init: {'theme':'dark'}}%%
pie
"Dogs" : 386
"Cats" : 85.9
"Rats" : 15
```

```mermaid
flowchart TD
    M[Marketing] -->|Give budget| P[Product]
    M --> S(Spreadsheet)
    S -->|via Airflow| A(Reward Value)
    P --> S
    E -->|API| A
    E -->|API| C(Conditions)
    P -->|Ask| E[Engineer]
    E -->|Github| X(Experiments)
    E -->|Github| G(Snowflake Query)
    G -->|Fetch from Airflow| U((User Selection))
    U -->|Assign| R((Rewards))
    A --> R
    C --> R
    X --> A
```





Yooo



# Customer Service  :computer:
Hola

Only mermaid

```mermaid
sequenceDiagram
GitLab->>Kroki: Request rendering
Kroki->>Mermaid: Request rendering
Mermaid-->>Kroki: Image
Kroki-->>GitLab: Image
```

kroki mermai

```kroki-mermaid
sequenceDiagram
GitLab->>Kroki: Request rendering
Kroki->>Mermaid: Request rendering
Mermaid-->>Kroki: Image
Kroki-->>GitLab: Image
```
Plant uml

```kroki-plantuml
@startuml
left to right direction
skinparam packageStyle rectangle
skinparam monochrome true
actor customer
actor clerk
rectangle checkout {
  customer -- (checkout)
  (checkout) .> (payment) : include
  (help) .> (checkout) : extends
  (checkout) -- clerk
}
@enduml
```
