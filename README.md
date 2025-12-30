CI/CD FLOW (Docker + K8s + GitHub)

1. Developer pushes code to GitHub
2. GitHub Actions triggers pipeline
3. Maven builds JAR
4. Docker builds image
5. Image pushed to Docker Hub
6. Kubernetes pulls image
7. Pod runs container
8. Service exposes application

| File              | Why it exists         |
| ----------------- | --------------------- |
| `Dockerfile`      | How app becomes image |
| `ci-cd.yaml`      | Automation rules      |
| `deployment.yaml` | How pods run          |
| `service.yaml`    | How app is exposed    |
| `application.yml` | App config            |

✅ Scenario : Run on another machine using Docker only
docker login
docker pull shashank2033/greeting-service:latest
docker run -d -p 8080:8080 shashank2033/greeting-service:latest
