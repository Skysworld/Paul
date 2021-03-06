/ * *  
   *   C o d e   g � n � r �   p a r   W i n D e v   M o b i l e   -   N E   P A S   M O D I F I E R   !  
   *   O b j e t   W i n D e v   M o b i l e   :   P r o j e t  
   *   C l a s s e   A n d r o i d   :   P r o j e t D o m o t i q u e  
   *   D a t e   :   2 9 / 0 1 / 2 0 1 6   0 9 : 0 2 : 0 2  
   *   V e r s i o n   d e   w d j a v a . d l l     :   1 9 . 0 . 1 4 2 . 0  
   * /  
  
  
 p a c k a g e   c o m . m a s o c i e t e . p r o j e t d o m o t i q u e . w d g e n ;  
  
  
 i m p o r t   c o m . m a s o c i e t e . p r o j e t d o m o t i q u e . * ;  
 i m p o r t   f r . p c s o f t . w d j a v a . c o r e . t y p e s . * ;  
 i m p o r t   f r . p c s o f t . w d j a v a . c o r e . * ;  
 i m p o r t   f r . p c s o f t . w d j a v a . c o r e . a p p l i c a t i o n . * ;  
 i m p o r t   f r . p c s o f t . w d j a v a . a p i . * ;  
 / * I m p o r t s   t r o u v � s   d a n s   l e   c o d e   W L * /  
 / * F i n   I m p o r t s   t r o u v � s   d a n s   l e   c o d e   W L * /  
  
  
  
  
  
 p u b l i c   c l a s s   G W D P P r o j e t D o m o t i q u e   e x t e n d s   W D P r o j e t  
 {  
 / * *  
   *   A c c � s   a u   p r o j e t :   P r o j e t D o m o t i q u e  
   *   P o u r   a c c � d e r   a u   p r o j e t   �   p a r t i r   d e   n ' i m p o r t e   o � :    
   *   G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t  
   * /  
 p u b l i c   s t a t i c   G W D P P r o j e t D o m o t i q u e   m s _ P r o j e c t ;  
  
   / /   F E N _ C o n n e c t i o n  
 p u b l i c   G W D F F E N _ C o n n e c t i o n   m W D _ F E N _ C o n n e c t i o n   =   n e w   G W D F F E N _ C o n n e c t i o n ( ) ;  
   / /   a c c e s s e u r   d e   F E N _ C o n n e c t i o n  
 p u b l i c   G W D F F E N _ C o n n e c t i o n   g e t F E N _ C o n n e c t i o n ( )  
 {  
 m W D _ F E N _ C o n n e c t i o n . v e r i f i e r O u v e r t e ( ) ;  
 r e t u r n   m W D _ F E N _ C o n n e c t i o n ;  
 }  
  
   / /   F E N _ A c c u e i l 0 1  
 p u b l i c   G W D F F E N _ A c c u e i l 0 1   m W D _ F E N _ A c c u e i l 0 1   =   n e w   G W D F F E N _ A c c u e i l 0 1 ( ) ;  
   / /   a c c e s s e u r   d e   F E N _ A c c u e i l 0 1  
 p u b l i c   G W D F F E N _ A c c u e i l 0 1   g e t F E N _ A c c u e i l 0 1 ( )  
 {  
 m W D _ F E N _ A c c u e i l 0 1 . v e r i f i e r O u v e r t e ( ) ;  
 r e t u r n   m W D _ F E N _ A c c u e i l 0 1 ;  
 }  
  
   / /   F E N _ A c c u e i l 0 1 1  
 p u b l i c   G W D F F E N _ A c c u e i l 0 1 1   m W D _ F E N _ A c c u e i l 0 1 1   =   n e w   G W D F F E N _ A c c u e i l 0 1 1 ( ) ;  
   / /   a c c e s s e u r   d e   F E N _ A c c u e i l 0 1 1  
 p u b l i c   G W D F F E N _ A c c u e i l 0 1 1   g e t F E N _ A c c u e i l 0 1 1 ( )  
 {  
 m W D _ F E N _ A c c u e i l 0 1 1 . v e r i f i e r O u v e r t e ( ) ;  
 r e t u r n   m W D _ F E N _ A c c u e i l 0 1 1 ;  
 }  
  
  
   / /   C o n s t r u c t e u r   d e   l a   c l a s s e   G W D P P r o j e t D o m o t i q u e  
 p u b l i c   G W D P P r o j e t D o m o t i q u e ( )  
 {  
 a j o u t e r F e n e t r e ( " F E N _ C o n n e c t i o n " ,   m W D _ F E N _ C o n n e c t i o n ) ;  
 a j o u t e r F e n e t r e ( " F E N _ A c c u e i l 0 1 " ,   m W D _ F E N _ A c c u e i l 0 1 ) ;  
 a j o u t e r F e n e t r e ( " F E N _ A c c u e i l 0 1 1 " ,   m W D _ F E N _ A c c u e i l 0 1 1 ) ;  
  
 }  
  
  
 / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /  
 / /   D � c l a r a t i o n   d e s   v a r i a b l e s   g l o b a l e s  
 / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /  
 s t a t i c  
 {  
 / /   A l l o c a t i o n   d e   l ' o b j e t   g l o b a l  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t   =   n e w   G W D P P r o j e t D o m o t i q u e ( ) ;  
  
 / /   D � f i n i t i o n   d e s   l a n g u e s   d u   p r o j e t  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t . s e t L a n g u e P r o j e t ( n e w   i n t [ ]   { 1 } ,   n e w   i n t [ ]   { 0 } ,   1 ) ;  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t . s e t N o m A n a l y s e P r o j e t ( " p r o j e t d o m o t i q u e " ) ;  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t . s e t M o d e G e s t i o n F i c h i e r ( t r u e ) ;  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t . s e t C r e a t i o n A u t o m a t i q u e F i c h i e r D o n n e e s ( t r u e ) ;  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t . s e t N o m C o l l e c t i o n P r o c e d u r e ( n e w   S t r i n g [ ] { } ) ;  
 }  
 p u b l i c   S t r i n g   g e t V e r s i o n A p p l i c a t i o n ( ) {   r e t u r n   " 0 . 0 . 1 . 0 " ; }  
 p u b l i c   S t r i n g   g e t N o m A P K ( ) {   r e t u r n   " A p p l i c a t i o n   A n d r o i d 1 " ; }  
 p u b l i c   i n t   g e t I d N o m A p p l i c a t i o n ( ) { r e t u r n   R . s t r i n g . a p p _ n a m e ; }  
 p u b l i c   b o o l e a n   i s M o d e A n s i ( ) {   r e t u r n   f a l s e ; }  
 p u b l i c   b o o l e a n   i s A f f e c t a t i o n T a b l e a u P a r C o p i e ( ) {   r e t u r n   t r u e ; }  
 p u b l i c   S t r i n g   g e t P a c k a g e R a c i n e ( ) {   r e t u r n   " c o m . m a s o c i e t e . p r o j e t d o m o t i q u e " ; }  
 p u b l i c   i n t   g e t I d I c o n e A p p l i c a t i o n ( ) {   r e t u r n   R . d r a w a b l e . i _ c _ o _ n _ e _ _ _ _ _ _ _ _ 1 ; }  
 p u b l i c   i n t   g e t I n f o P l a t e f o r m e ( E W D I n f o P l a t e f o r m e   i n f o )  
 {  
 s w i t c h ( i n f o )  
 {  
 c a s e   D P I _ E C R A N   :   r e t u r n   2 4 0 ;  
 c a s e   H A U T E U R _ B A R R E _ S Y S T E M E   :   r e t u r n   2 5 ;  
 c a s e   H A U T E U R _ B A R R E _ T I T R E   :   r e t u r n   2 5 ;  
 c a s e   H A U T E U R _ A C T I O N _ B A R   :   r e t u r n   4 8 ;  
 c a s e   H A U T E U R _ B A R R E _ B A S   :   r e t u r n   0 ;  
 c a s e   H A U T E U R _ E C R A N   :   r e t u r n   5 3 3 ;  
 c a s e   L A R G E U R _ E C R A N   :   r e t u r n   3 2 0 ;  
 d e f a u l t   :   r e t u r n   0 ;  
 }  
 }  
 p r o t e c t e d   v o i d   d e c l a r e r R e s s o u r c e s ( )  
 {  
 a j o u t e r F i c h i e r A s s o c i e ( " D : \ \ S N 2 I R 2 0 1 6 \ \ B A R R E L L O N \ \ W I N D E V P R O J E C T \ \ M E S   P R O J E T S   M O B I L E \ \ P R O J E T D O M O T I Q U E \ \ B G _ M E D I A C E N T E R . J P G " , R . d r a w a b l e . b g _ m e d i a c e n t e r _ 2 ,   " " ) ;  
 a j o u t e r F i c h i e r A s s o c i e ( " D : \ \ S N 2 I R 2 0 1 6 \ \ B A R R E L L O N \ \ W I N D E V P R O J E C T \ \ M E S   P R O J E T S   M O B I L E \ \ P R O J E T D O M O T I Q U E \ \ B T N _ M E D I A C E N T E R _ A N I M . G I F ? E 5 _ A 6 _ 2 N P " , R . d r a w a b l e . b t n _ m e d i a c e n t e r _ a n i m _ 3 _ n p 2 _ s e l e c t o r _ a n i m ,   " " ) ;  
 a j o u t e r F i c h i e r A s s o c i e ( " D : \ \ S N 2 I R 2 0 1 6 \ \ B A R R E L L O N \ \ W I N D E V P R O J E C T \ \ M E S   P R O J E T S   M O B I L E \ \ P R O J E T D O M O T I Q U E \ \ C O M B O _ M E D I A C E N T E R . G I F ? E 5 _ 3 N P _ 6 _ 6 _ 6 _ 6 " , R . d r a w a b l e . c o m b o _ m e d i a c e n t e r _ 4 _ n p 3 _ 6 _ 6 _ 6 _ 6 _ s e l e c t o r ,   " " ) ;  
 a j o u t e r F i c h i e r A s s o c i e ( " D : \ \ S N 2 I R 2 0 1 6 \ \ B A R R E L L O N \ \ W I N D E V P R O J E C T \ \ M E S   P R O J E T S   M O B I L E \ \ P R O J E T D O M O T I Q U E \ \ I N T E R U P T E U R _ M E D I A C E N T E R _ A N I M . G I F ? E 1 2 _ R a d i o " , R . d r a w a b l e . i n t e r u p t e u r _ m e d i a c e n t e r _ a n i m _ 5 _ s e l e c t o r ,   " " ) ;  
 a j o u t e r F i c h i e r A s s o c i e ( " D : \ \ S N 2 I R 2 0 1 6 \ \ B A R R E L L O N \ \ W I N D E V P R O J E C T \ \ M E S   P R O J E T S   M O B I L E \ \ P R O J E T D O M O T I Q U E \ \ S A I S I E _ M E D I A C E N T E R . G I F ? E 5 _ 3 N P _ 2 _ 4 _ 2 _ 2 " , R . d r a w a b l e . s a i s i e _ m e d i a c e n t e r _ 6 _ n p 3 _ 2 _ 4 _ 2 _ 2 _ s e l e c t o r ,   " " ) ;  
 a j o u t e r F i c h i e r A s s o c i e ( " D : \ \ S N 2 I R 2 0 1 6 \ \ B A R R E L L O N \ \ W I N D E V P R O J E C T \ \ M E S   P R O J E T S   M O B I L E \ \ P R O J E T D O M O T I Q U E \ \ T A B _ M E D I A C E N T E R . G I F ? E 2 _ T a b s _ 1 N P " , R . d r a w a b l e . t a b _ m e d i a c e n t e r _ 7 _ n p 1 _ s e l e c t o r ,   " " ) ;  
 a j o u t e r F i c h i e r A s s o c i e ( " D : \ \ S N 2 I R 2 0 1 6 \ \ B A R R E L L O N \ \ W I N D E V P R O J E C T \ \ M E S   P R O J E T S   M O B I L E \ \ P R O J E T D O M O T I Q U E \ \ B T N _ S T D _ O K . G I F ? E 5 " , R . d r a w a b l e . b t n _ s t d _ o k _ 8 _ s e l e c t o r ,   " " ) ;  
 }  
  
 / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /  
 / /   F o r m a t s   d e s   m a s q u e s   d u   p r o j e t  
 / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /  
  
  
 / * *  
   *   A p p e l   d e s   m � t h o d e s   d ' i n i t i a l i s a t i o n   d e s   c l a s s e s   /   c o l l e c t i o n s   d e   p r o c � d u r e s   /   p r o j e t  
   * /  
 s t a t i c   v o i d   G W D P P r o j e t D o m o t i q u e _ I n i t P r o j e t (   S t r i n g   [ ]   a r g s )  
 {  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t . i n i t i a l i s e r P r o j e t ( " P r o j e t D o m o t i q u e " ,   " A p p l i c a t i o n   A n d r o i d 1 " ,   a r g s ) ;  
 }  
  
 / * *  
   *   A p p e l   d e s   m � t h o d e s   d e   t e r m i n a i s o n   d e s   p r o j e t   /   c o l l e c t i o n s   d e   p r o c � d u r e s   /   c l a s s e s  
   * /  
 s t a t i c   p r o t e c t e d   v o i d   G W D P P r o j e t D o m o t i q u e _ T e r m i n e P r o j e t ( )  
 {  
  
 / /   T e r m i n a i s o n   d e s   c o l l e c t i o n s   d e   p r o c � d u r e s   e t   d e s   c l a s s e s  
  
 / /   L i b � r a t i o n   d e   l ' o b j e t   g l o b a l  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t   =   n u l l ;  
 }  
  
 / * *  
   *   L a n c e r   d e   l ' a p p l i c a t i o n   A n d r o i d  
   * /  
 p u b l i c   s t a t i c   c l a s s   W D L a n c e u r   e x t e n d s   W D A b s t r a c t L a n c e u r  
 {  
 p u b l i c   v o i d   i n i t ( )  
 {  
 / /   A p p e l   d e s   m � t h o d e s   d ' i n i t i a l i s a t i o n  
 G W D P P r o j e t D o m o t i q u e _ I n i t P r o j e t ( n u l l ) ;  
 }  
 p u b l i c   v o i d   r u n ( )  
 {  
  
 G W D P P r o j e t D o m o t i q u e . m s _ P r o j e c t . l a n c e r P r o j e t ( " F E N _ C o n n e c t i o n " ) ;  
 }  
 }  
 }  
 