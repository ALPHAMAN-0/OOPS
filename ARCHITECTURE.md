---
tags: [architecture, OOPS]
---

## Stack
- Java (JDK 8+ per README; Maven modules pin `maven.compiler.source/target` 22 and 25).
- Maven build for the two `Java OOPS and Some Probelms/*` modules (each has its own `pom.xml`, no parent POM).
- No frameworks/libs observed — plain Java standalone programs, no dependencies declared in either `pom.xml`.
- `BASIC/*` files are loose `.java` files with no build file (compile/run directly via `javac`/`java` per README).

## Directory map
| path | what lives there |
|---|---|
| `BASIC/Basic` | Java language fundamentals: variables, operators, strings, type casting (13 files) |
| `BASIC/DataType` | Primitive/non-primitive data type examples (6 files) |
| `BASIC/Methods` | Method syntax, params, return values, overloading, scope, recursion (6 files) |
| `BASIC/OOP` | Core OOP concept examples: inheritance, encapsulation, polymorphism, abstraction, blueprint (5 files) |
| `Java OOPS and Some Probelms/Inharitance` | Maven module; `src/main/java/org/example/{Main,Dog,Animal}.java` |
| `Java OOPS and Some Probelms/Class_And_Objects` | Maven module; `src/main/java/org/example/Main.java` |
| `README.md` | Repo-root topic/contents index |

## Diagram
```mermaid
flowchart TD
    BASIC_Basic[BASIC_Basic]
    BASIC_DataType[BASIC_DataType]
    BASIC_Methods[BASIC_Methods]
    BASIC_OOP[BASIC_OOP]
    Inharitance_Module[Inharitance_Module]
    Class_And_Objects_Module[Class_And_Objects_Module]
```

## Component index
- [[BASIC_Basic]]
- [[BASIC_DataType]]
- [[BASIC_Methods]]
- [[BASIC_OOP]]
- [[Inharitance_Module]]
- [[Class_And_Objects_Module]]

## Entry points
- `BASIC/*`: each `.java` file is its own standalone entry point (`javac X.java && java X` per README "How to Use").
- `Java OOPS and Some Probelms/Inharitance`: `src/main/java/org/example/Main.java`.
- `Java OOPS and Some Probelms/Class_And_Objects`: `src/main/java/org/example/Main.java`.

## Conventions
- Maven modules use package `org.example`, standard `src/main/java` layout (observed in both `pom.xml`/src trees).
- `BASIC/*` files use one top-level public class per file, PascalCase filenames matching class names (observed via tree + README table).
- Each Maven module is independent (own `pom.xml`, own compiler version), no shared parent POM (observed: `groupId org.example`, differing `maven.compiler.source` 22 vs 25).

## Where things go
- To add a new BASIC language-fundamentals example: add a `.java` file under `BASIC/Basic` or `BASIC/DataType` and update `README.md`'s table.
- To add a new OOP concept example: add a `.java` file under `BASIC/OOP` and update `README.md`.
- To add a new Maven-based mini-project: create a new folder under `Java OOPS and Some Probelms/` with its own `pom.xml` and `src/main/java/org/example/Main.java`.
- To extend the `Inharitance` module: touch `Java OOPS and Some Probelms/Inharitance/src/main/java/org/example/{Main,Dog,Animal}.java`.
