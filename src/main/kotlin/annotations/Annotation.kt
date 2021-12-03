package annotations

/**
 * Annotation
 *
 * menambahkan metadata ke kode program
 * yang kita buat
 */

// Anotation class tidak boleh ada properties
//  atau member di body nya
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)