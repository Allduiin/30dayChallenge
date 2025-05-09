# ThirtyDaysChallenge

# План обучения и финального проекта: Java/Kotlin, Spring Boot, Hibernate и базы данных

## Неделя 1: Collections и Generics

### День 1: Очереди в Collections
- **Теория**: Изучите интерфейсы Queue, Deque и их реализации (LinkedList, PriorityQueue).
- **Практика**: Реализуйте простую очередь задач с использованием LinkedList.

### День 2: Очереди – Практические задачи
- **Практика**: Напишите программу, моделирующую очередь в магазине: добавление клиентов, обслуживание, удаление.

### День 3: Generics – Основы
- **Теория**: Поймите концепцию обобщений (Generics) в Java/Kotlin.
- **Практика**: Создайте обобщенный класс Box<T> для хранения объектов любого типа.

### День 4: PECS (Producer Extends, Consumer Super)
- **Теория**: Изучите принцип PECS.
- **Практика**: Реализуйте методы, использующие PECS, например, методы для добавления и извлечения элементов из коллекции.

### День 5: Generics – Практические задачи
- **Практика**: Создайте обобщенные методы для сортировки и фильтрации коллекций.

### День 6: Комбинирование Collections и Generics
- **Практика**: Реализуйте обобщенную очередь с приоритетом.

### День 7: Резервный день
- **Повторение**: Повторите материалы недели, решите дополнительные задачи.

---

## Неделя 2: Spring Data и Hibernate

### День 8: Введение в Spring Data и Hibernate
- **Теория**: Ознакомьтесь с основами Spring Data и Hibernate.
- **Практика**: Настройте простой проект Spring Boot с подключением Hibernate.

### День 9: N+1 проблема
- **Теория**: Изучите, что такое N+1 проблема.
- **Практика**: Создайте пример с N+1 и решите его с помощью JOIN FETCH.

### День 10: Entity Graph
- **Теория**: Узнайте о Entity Graph в Hibernate.
- **Практика**: Реализуйте загрузку связанных сущностей с помощью Entity Graph.

### День 11: Типы JOIN и картизианский продукт с пагинацией
- **Теория**: Изучите INNER JOIN, LEFT JOIN, RIGHT JOIN и картизианский продукт.
- **Практика**: Напишите запросы с разными типами JOIN и реализуйте пагинацию.

### День 12: LazyInitializationException и Fetch Types
- **Теория**: Поймите причины LazyInitializationException и различия между FetchType.LAZY и FetchType.EAGER.
- **Практика**: Создайте сценарии, вызывающие исключение, и исправьте их.

### День 13: OSIV (Open Session in View) и One To One Lazy
- **Теория**: Изучите концепцию OSIV и ленивую загрузку One-to-One отношений.
- **Практика**: Настройте OSIV в проекте и реализуйте ленивую загрузку связанных сущностей.

### День 14: Резервный день
- **Повторение**: Повторите материалы недели, решите дополнительные задачи.

---

## Неделя 3: Базы данных и транзакции

### День 15: Типы индексов и индексирование в базах данных
- **Теория**: Изучите различные типы индексов (B-Tree, Hash и др.).
- **Практика**: Создайте таблицы и добавьте различные типы индексов.

### День 16: ACID свойства
- **Теория**: Поймите ACID (Atomicity, Consistency, Isolation, Durability).
- **Практика**: Реализуйте транзакции в приложении и продемонстрируйте соблюдение ACID.

### День 17: Уровни изоляции транзакций
- **Теория**: Изучите уровни изоляции (Read Uncommitted, Read Committed, Repeatable Read, Serializable).
- **Практика**: Настройте разные уровни изоляции и наблюдайте поведение транзакций.

### День 18: SQL-инъекции
- **Теория**: Узнайте, что такое SQL-инъекции и как их предотвращать.
- **Практика**: Напишите уязвимый код и защитите его с помощью подготовленных выражений.

### День 19: Ограничения (Constraints) в базах данных
- **Теория**: Изучите различные ограничения (PRIMARY KEY, FOREIGN KEY, UNIQUE, NOT NULL и др.).
- **Практика**: Создайте таблицы с различными ограничениями и протестируйте их.

### День 20: Типы индексов в базах данных
- **Теория**: Поймите, какие индексы используются по умолчанию (например, B-Tree).
- **Практика**: Исследуйте производительность запросов с разными типами индексов.

### День 21: Резервный день
- **Повторение**: Повторите материалы недели, решите дополнительные задачи.

---

## Неделя 4: Теория и NoSQL

### День 22: CAP теорема
- **Теория**: Изучите CAP теорему и её применение.
- **Практика**: Ознакомьтесь с примерами баз данных, соответствующих разным частям теоремы.

### День 23: Нормализация баз данных
- **Теория**: Поймите принципы нормализации (1NF, 2NF, 3NF и т.д.).
- **Практика**: Нормализуйте примерную базу данных.

### День 24: Типы JOIN в SQL
- **Теория**: Повторите INNER JOIN, LEFT JOIN, RIGHT JOIN, FULL OUTER JOIN и CROSS JOIN.
- **Практика**: Напишите запросы с каждым типом JOIN на примере.

### День 25: Типы NoSQL баз данных
- **Теория**: Изучите основные типы NoSQL баз данных: документные, колонковые, графовые, ключ-значение.
- **Практика**: Настройте простую NoSQL базу данных (например, MongoDB) и выполните базовые операции.

### День 26: Индексы в NoSQL базах данных
- **Теория**: Узнайте, как работают индексы в NoSQL системах.
- **Практика**: Создайте индексы в выбранной NoSQL базе и измерьте производительность.

### День 27: Обзор и закрепление знаний
- **Практика**: Решите комплексные задачи, объединяющие различные темы курса.

### День 28: Подготовка к финальному проекту
- **Планирование**: Спланируйте структуру небольшого приложения, выберите технологии и функционал.

### День 29: Начало разработки приложения
- **Практика**: Начните реализовывать приложение, настроив базу данных и основные сущности.

### День 30: Завершение разработки и тестирование
- **Практика**: Завершите приложение, реализуйте оставшиеся функции и протестируйте его.

---

## Финальный проект: Веб-приложение ToDo App

### Функционал:
- Регистрация и аутентификация пользователей.
- CRUD операции для задач.
- Оптимизация запросов, защита от SQL-инъекций, использование индексов.
- Работа с NoSQL базой для хранения комментариев.

### Технологии:
- Kotlin
- Spring Boot
- Hibernate
- PostgreSQL
- MongoDB

### Шаги:
1. Настройте проект с необходимыми зависимостями.
2. Спроектируйте базу данных и создайте сущности.
3. Реализуйте REST API.
4. Оптимизируйте производительность.
5. Тестируйте приложение.

---# 30dayChallenge
