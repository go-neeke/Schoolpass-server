#!/bin/bash

echo "===== DEPLOY START ====="

cd /root/Yellowpass-server

echo "📥 Pull latest code"
git pull origin main

echo "🔨 Build project"
./gradlew clean build -x test

echo "🚀 Restart server"
sudo systemctl restart yellowpass

echo "📊 Status check"
sudo systemctl status yellowpass --no-pager

echo "✅ DEPLOY DONE"
