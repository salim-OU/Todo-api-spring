# Todo API v1

## Description
Todo API v1 est une application Java qui permet de gérer une liste de tâches (todo list) via une interface API. Les utilisateurs peuvent créer, lire, mettre à jour et supprimer des tâches.

## Fonctionnalités
- **Ajouter une tâche** : Crée une nouvelle tâche.
- **Afficher toutes les tâches** : Récupère et affiche toutes les tâches.
- **Mettre à jour une tâche** : Modifie les détails d'une tâche existante.
- **Supprimer une tâche** : Supprime une tâche de la liste.

## Prérequis
- Java 11 ou version supérieure
- Maven (pour la gestion des dépendances)

## Installation
1. Clonez ce dépôt ou téléchargez les fichiers du projet.

```bash
git clone https://votre-repo-url.git
Accédez au répertoire du projet :
Copier
cd todo_api_v1
Installez les dépendances avec Maven :
Copier
mvn install
Utilisation
Lancez l'application :
Copier
mvn spring-boot:run
Accédez à l'API via http://localhost:8080/api/todos.
Endpoints
GET /api/todos : Récupère toutes les tâches.
POST /api/todos : Ajoute une nouvelle tâche.
PUT /api/todos/{id} : Met à jour une tâche existante.
DELETE /api/todos/{id} : Supprime une tâche.
Exemple de requêtes
Ajouter une tâche
Copier
POST /api/todos
Content-Type: application/json

{
    "title": "Nouvelle tâche",
    "completed": false
}
Afficher toutes les tâches
Copier
GET /api/todos
