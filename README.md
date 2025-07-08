# nivelacion2025movil-I
# 📱 Curso: Android con Kotlin

Este repositorio contiene material de apoyo para aprender conceptos básicos y prácticos del desarrollo de aplicaciones Android usando Kotlin.

---

## 📌 Temario

1. [Ciclo de Vida de una Actividad en Android](#1-ciclo-de-vida-de-una-actividad-en-android)
2. [Manejo de Botones](#2-manejo-de-botones)
3. [RadioButton](#3-radiobutton)
4. [CheckBox](#4-checkbox)
5. [Spinner](#5-spinner)
6. [Programación Orientada a Objetos (POO) con Kotlin](#6-programación-orientada-a-objetos-poo-con-kotlin)

---

## 1️⃣ Ciclo de Vida de una Actividad en Android

El ciclo de vida define cómo se comporta una actividad mientras se ejecuta.

**Métodos principales:**

- `onCreate()`: Se llama cuando la actividad se crea.
- `onStart()`: Se llama cuando la actividad se vuelve visible.
- `onResume()`: Se llama cuando la actividad empieza a interactuar con el usuario.
- `onPause()`: Se llama cuando otra actividad se superpone parcialmente.
- `onStop()`: Se llama cuando la actividad ya no es visible.
- `onDestroy()`: Se llama cuando la actividad se destruye.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Log.d("CicloDeVida", "onCreate")
}

override fun onStart() {
    super.onStart()
    Log.d("CicloDeVida", "onStart")
}

override fun onResume() {
    super.onResume()
    Log.d("CicloDeVida", "onResume")
}

override fun onPause() {
    super.onPause()
    Log.d("CicloDeVida", "onPause")
}

override fun onStop() {
    super.onStop()
    Log.d("CicloDeVida", "onStop")
}

override fun onDestroy() {
    super.onDestroy()
    Log.d("CicloDeVida", "onDestroy")
}
