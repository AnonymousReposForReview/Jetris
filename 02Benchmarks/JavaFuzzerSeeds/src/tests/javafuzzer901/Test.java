package tests.javafuzzer901;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:25:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3343255767L;
    public static float fFld=109.375F;
    public static volatile double dFld=1.97521;
    public static long lArrFld[][]=new long[N][N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 6L);
        FuzzerUtils.init(Test.iArrFld, -13510);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1) {

        int i2=6, i3=-33085, i4=-7, i5=133, i6=-58891, i7=58, iArr[]=new int[N];
        short s=14194;
        boolean b=true, bArr[]=new boolean[N];
        double d=1.27148;

        FuzzerUtils.init(iArr, 50749);
        FuzzerUtils.init(bArr, true);

        i2 = 1;
        while (++i2 < 373) {
            for (i3 = 1; 5 > i3; i3++) {
                i5 = 1;
                do {
                    s += (short)(((i5 * i2) + i2) - i2);
                    Test.instanceCount = i3;
                    Test.fFld = Test.instanceCount;
                    i4 = i1;
                } while (++i5 < 2);
                iArr[i2] = i4;
                i1 |= 7627;
                switch ((i2 % 5) + 47) {
                case 47:
                    Test.fFld += (-1.313F + (i3 * i3));
                    for (i6 = 1; i6 < 2; i6++) {
                        iArr[i6] >>= i2;
                        bArr[i2] = b;
                        i1 += (10657 + (i6 * i6));
                    }
                    break;
                case 48:
                    iArr[i2] = (int)d;
                    break;
                case 49:
                    i7 += i3;
                    break;
                case 50:
                    i7 = i5;
                    break;
                case 51:
                    iArr[i3 + 1] = i5;
                    break;
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + i4 + i5 + s + i6 + i7 + (b ? 1 : 0) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(float f, int i) {

        int i8=-74, i9=-15774, i10=-47449, i11=5, i12=2168;
        double d1=-2.98899;
        long l1=-475137936438149016L;
        boolean b1=true;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 0.593F);

        vMeth1(24776);
        for (i8 = 14; i8 < 294; i8++) {
            for (i10 = i8; i10 < 6; i10++) {
                Test.lArrFld[i10 - 1][i8 - 1] *= (long)d1;
                i11 %= (int)(i8 | 1);
                Test.instanceCount = 239;
                i11 += (int)(5379133154254434240L + (i10 * i10));
                Test.instanceCount += (i10 + i11);
                i11 -= 47345;
                for (l1 = 1; l1 > 1; l1--) {
                    i12 += (int)(l1 * l1);
                    Test.iArrFld = Test.iArrFld;
                    fArr[i10 + 1] = FuzzerUtils.float1array(N, (float)0.169F);
                    if (b1) break;
                    Test.instanceCount += (l1 + i11);
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d1) + l1 + i12 +
            (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static short sMeth(long l) {

        int i13=-102, i14=40362, i15=41801, i16=-2, i17=-54490, i18=-21092;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1929858844L);

        vMeth(Test.fFld, -5);
        i13 %= (int)(i13 | 1);
        for (i14 = 1; 143 > i14; i14++) {
            for (i16 = 1; i16 < 11; i16++) {
                short s1=-7878;
                Test.fFld = -80;
                i17 = s1;
                i17 = i15;
                i18 = 1;
                while (++i18 < 2) {
                    Test.iArrFld = Test.iArrFld;
                    i13 >>= i17;
                    s1 = (short)Test.dFld;
                    i15 = (int)-1.1022;
                    s1 -= (short)i14;
                    if (false) break;
                }
                Test.iArrFld[i16] <<= i14;
            }
        }
        long meth_res = l + i13 + i14 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(lArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {


        sMeth(Test.instanceCount);


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
