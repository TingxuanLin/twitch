# Step 1: Build React app
FROM node:18 AS builder
WORKDIR /app
COPY ./twitchfe/package.json ./twitchfe/package-lock.json ./
RUN npm install
COPY ./twitchfe ./
RUN npm run build

# Step 2: Serve with Nginx (default config)
FROM nginx:alpine
COPY --from=builder /app/build /usr/share/nginx/html
COPY ./twitchfe/nginx.conf /etc/nginx/nginx.conf

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]


