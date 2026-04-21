# Sistema de Reservas - Base de Datos

## Arquitectura

El sistema está dividido en dos microservicios:

### 🔐 Auth
- usuarios
- roles
- usuario_roles

### 📅 Reservas
- canchas
- reservas

---

## Tecnologías

- PostgreSQL
- Liquibase
- GitFlow (dev → qa → main)

---

## Liquibase

Se utiliza para versionar la base de datos mediante changelogs:

- db.changelog-master.xml
- módulos por microservicio

---

## Flujo de ramas

- develop → desarrollo
- qa → pruebas
- main → producción
