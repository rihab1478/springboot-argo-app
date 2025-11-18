# 🚀 Github action c/cd pipline for Spring Boot Application with postgres db deployed with HELM/ArgoCD

![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/yourusername/yourrepo/ci-cd.yml?branch=main) 
![Docker](https://img.shields.io/docker/v/yourdockerusername/app?label=Docker%20Image)
![Argo CD](https://img.shields.io/badge/ArgoCD-Deployment-blue)

This project implements a **fully automated CI/CD pipeline** for a Spring Boot application using **GitHub Actions**, **Docker**, **Helm**, and **Argo CD**.

---

## 📌 Key Features

- Automated Spring Boot JAR build  
- Docker image creation & push with branch-based tagging (`dev`, `staging`, `prod`)  
- Helm-based deployment with environment-specific `values.yaml` (`dev`, `staging`, `prod`)   
- Argo CD GitOps deployment with auto-sync, health checks, and pruning  

---

## ⚙️ Pipeline Overview

1. **Trigger**: On `push` to `dev`, `staging`, `main`  
2. **Build**: Checkout repo → Set up JDK 17 → Build JAR  
3. **Dockerization**: Build image → Tag based on branch → Push to Docker Hub  
4. **Helm Deployment via Argo CD**: Install Argo CD CLI → Login → Update Helm chart → Force sync → Wait for healthy status  
5. **Verification**: Check Argo CD app status → Confirm deployment success  

---

## 🛠️ Technologies Used

| Tool | Purpose |
|------|---------|
| Java 17 | Build Spring Boot application |
| Maven | Project build & dependency management |
| Docker | Containerization |
| Helm | Kubernetes package management |
| PostgreSQL | Database per environment |
| GitHub Actions | CI/CD automation |
| Argo CD | GitOps deployment |

---

## 📂 Project Structure


.
├── .github/workflows/ci-cd.yml  # CI/CD GitHub Actions pipeline
├── helm-chart/                   # Helm chart for Spring Boot + PostgreSQL
├── src/                          # Spring Boot source code
├── pom.xml                        # Maven configuration
└── README.md                      # Project documentation
