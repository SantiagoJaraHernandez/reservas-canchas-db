# 🏟️ Base de Datos - Sistema de Reservas de Canchas

Este repositorio contiene el diseño y estructura inicial de la base de datos
para el sistema de reservas de canchas, gestionada con **Liquibase** y **PostgreSQL**.

---

## 📂 Estructura del Proyecto

- reservas-canchas-db/
  - scripts/
    - database.sql
  - model/
    - modelo-entidad-relacion.png
  - changelog-master.xml
  - changelog-01-create-tables.xml
  - changelog-02-initial-data.xml
  - liquibase.properties
  - README.md

---

## 📜 Estructura de la Base de Datos

El sistema está compuesto por las siguientes tablas principales:

### 👤 Usuarios
- **id_usuario** (PK, autoincremental)
- nombre
- apellido
- email (**UNIQUE**)
- contraseña
- telefono
- fecha_registro
- estado

### ⚽ Canchas
- **id_cancha** (PK, autoincremental)
- nombre
- tipo
- ubicacion
- precio_por_hora
- estado

### 📅 Reservas
- **id_reserva** (PK, autoincremental)
- id_usuario (**FK → usuarios.id_usuario**)
- id_cancha (**FK → canchas.id_cancha**)
- fecha
- hora_inicio
- hora_fin
- estado
- fecha_creacion

---

## 🔗 Relaciones

- Un **usuario** puede realizar muchas **reservas** (1:N).
- Una **cancha** puede tener muchas **reservas** (1:N).
- Una **reserva** pertenece a un único **usuario** y a una única **cancha**.

---

## 🛠️ Motor de Base de Datos

- **PostgreSQL 17.5**
- Control de versiones de esquema con **Liquibase 5.0.2**
- Driver JDBC: `postgresql-42.7.x.jar`

---

## 🚀 Uso con Liquibase

1. Configurar `liquibase.properties` con la conexión a PostgreSQL.
2. Validar el changelog:
   ```bash
   liquibase validate
