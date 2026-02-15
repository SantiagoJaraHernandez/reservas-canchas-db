# 🏟️ Base de Datos - Sistema de Reservas de Canchas

Este repositorio contiene el diseño y estructura inicial de la base de datos
para el sistema de reservas de canchas.

---

## 📂 Estructura del Proyecto

- reservas-canchas-db/
  - scripts/
    - database.sql
  - model/
    - modelo-entidad-relacion.png
  - README.md

---

## 📜 Estructura de la Base de Datos

El sistema está compuesto por las siguientes tablas:

### 👤 Usuarios
- id_usuario (PK)
- nombre
- apellido
- email (UNIQUE)
- contraseña
- telefono
- fecha_registro
- estado

### ⚽ Canchas
- id_cancha (PK)
- nombre
- tipo
- ubicacion
- precio_por_hora
- estado

### 📅 Reservas
- id_reserva (PK)
- id_usuario (FK)
- id_cancha (FK)
- fecha
- hora_inicio
- hora_fin
- estado
- fecha_creacion

---

## 🔗 Relaciones

- Un usuario puede realizar muchas reservas (1:N)
- Una cancha puede tener muchas reservas (1:N)
- Una reserva pertenece a un único usuario y a una única cancha

---

## 🛠️ Motor de Base de Datos

PostgreSQL
