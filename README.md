# Todo API v1

![Java](https://img.shields.io/badge/Java-11%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.x-green)
![Maven](https://img.shields.io/badge/Maven-3.x-blue)

## Description

Todo API v1 est une application Java permettant la gestion complète d'une liste de tâches via une interface RESTful. Cette API offre toutes les opérations CRUD (Create, Read, Update, Delete) nécessaires pour gérer efficacement vos tâches.

## Fonctionnalités principales

L'API propose un ensemble complet de fonctionnalités pour la gestion des tâches :

- Création de nouvelles tâches avec titre et statut
- Consultation de l'ensemble des tâches enregistrées
- Modification des détails des tâches existantes
- Suppression des tâches devenues obsolètes

## Prérequis techniques

Pour exécuter cette application, vous devez disposer de :

- Java 11 ou version supérieure
- Maven 3.x ou version supérieure
- Un environnement de développement compatible Java

## Installation

1. Cloner le repository
```bash
git clone https://votre-repo-url.git
```

2. Accéder au répertoire du projet
```bash
cd todo_api_v1
```

3. Installer les dépendances
```bash
mvn install
```

## Démarrage de l'application

Exécutez la commande suivante pour lancer l'application :
```bash
mvn spring-boot:run
```

L'API sera accessible à l'adresse : `http://localhost:8080/api/todos`

## Documentation des endpoints

L'API expose les endpoints suivants :

### Gestion des tâches

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/todos` | Récupère toutes les tâches |
| POST | `/api/todos` | Crée une nouvelle tâche |
| PUT | `/api/todos/{id}` | Met à jour une tâche existante |
| DELETE | `/api/todos/{id}` | Supprime une tâche |

## Exemples d'utilisation

### Création d'une tâche

```bash
POST /api/todos
Content-Type: application/json

{
    "title": "Nouvelle tâche",
    "completed": false
}
```

### Récupération des tâches

```bash
GET /api/todos
```

### Mise à jour d'une tâche

```bash
PUT /api/todos/1
Content-Type: application/json

{
    "title": "Tâche modifiée",
    "completed": true
}
```

### Suppression d'une tâche

```bash
DELETE /api/todos/1
```

## Support et contribution

Pour toute question ou suggestion d'amélioration, n'hésitez pas à :
- Ouvrir une issue dans le repository
- Proposer une pull request
- Contacter l'équipe de développement

## Licence

Ce projet est distribué sous la licence MIT. Voir le fichier `LICENSE` pour plus de détails.

## Contact

Nom : Oujjet 

Projet: [https://github.com/votre-username/todo_api_v1](https://github.com/votre-username/todo_api_v1)
