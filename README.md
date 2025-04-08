
# **Dialog Hooker Integration Guide**

> Hook any Android app and inject your custom Dialogs easily using DialogHooker by **Ahmed**.

---

## **Step-by-Step Setup**

### 1. **Download the Hook Dialog Classes**
Grab the required classes from the following link:

[Download HookDilogClasses.zip](https://github.com/Gisnsl/DialogHooker/releases/download/Ahmed/HookDilogClasses.zip)

Unzip the content into your smali or source directory.

---

### 2. **Find the Entry Point (Main Activity)**

Locate the **Main Activity** or any method where you want your Dialog to be shown.

Example: Locate `onCreate` method of your MainActivity.

---

### 3. **Inject Dialog Hook Code**

Inside the first line of `onCreate` method (or any other target method), add the following code:

```smali
invoke-static {v5}, Lmahos/Dialog/DialogHtmlByAhmed;->get(Landroid/content/Context;)V
```

> Ensure `v5` holds a valid Context. You may replace it with the correct register holding context.

---

### 4. **Rename the Hook Class**

Check how many classes your target app has.

If the app contains **6 classes**, rename the Hook class file to **`classes7.dex`**.

This is essential to avoid conflicts with existing application classes.

---

## **Visual Example**

```plaintext
AppClasses:
├── classes.dex
├── classes2.dex
├── classes3.dex
├── classes4.dex
├── classes5.dex
├── classes6.dex
├── classes7.dex   <-- Your injected Dialog class here
```

---

## **Need Help or Want More Tools?**

### **[Join My Telegram Channel](https://t.me/maho_s9)**

<a href="https://t.me/maho_s9">
  <img src="https://upload.wikimedia.org/wikipedia/commons/8/82/Telegram_logo.svg" width="30" height="30" />
</a>

Stay updated with more tools, guides, and powerful Android hacking content!

---

> Made with passion by **maho_s9**

