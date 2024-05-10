package tests.javafuzzer1612;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 00:11:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2848052312L;
    public static int iFld=-55072;
    public static short sFld=-10489;
    public static float fFld=78.272F;
    public static boolean bFld=false;
    public int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 41L);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b) {


        Test.iFld = (int)-720414531271851626L;
        Test.iFld = Test.iFld;
        Test.lArrFld[(Test.iFld >>> 1) % N] = -82;
        Test.iFld = Test.iFld;
        vMeth1_check_sum += (b ? 1 : 0);
    }

    public static short sMeth() {

        boolean b1=false;
        int i2=-152, i3=17270, i4=1, i5=-117, iArr[]=new int[N];
        float f=44.78F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-22686);
        FuzzerUtils.init(iArr, 8);

        vMeth1(b1);
        for (i2 = 7; i2 < 138; i2++) {
            for (i4 = 1; 12 > i4; ++i4) {
                f = i5;
                Test.instanceCount += i4;
                Test.iFld -= i5;
                Test.sFld -= (short)i4;
                i5 += (int)2.619F;
                if (b1) continue;
                Test.instanceCount += (((i4 * i2) + i2) - Test.instanceCount);
            }
            i3 = i5;
            sArr[i2 + 1] <<= (short)Test.instanceCount;
            sArr[i2] <<= (short)i5;
            iArr[i2 - 1] -= i4;
            i5 <<= (int)-4L;
        }
        long meth_res = (b1 ? 1 : 0) + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth() {

        int i=-197, i1=-128;
        short s=27944;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 3858783291L);

        for (i = 9; i < 181; i++) {
            lArr2[i + 1] |= ((-(s - i)) + Test.instanceCount);
            i1 -= sMeth();
        }
        vMeth_check_sum += i + i1 + s + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        int i6=97, i7=10, i8=-1, i9=-44157, i10=3, i11=-62373, i12=-159;
        float f1=2.420F, f2=-30.12F, f3=1.737F;
        byte by=-115;
        long lArr[]=new long[N], lArr1[]=new long[N];

        FuzzerUtils.init(lArr, -47813114L);
        FuzzerUtils.init(lArr1, 165L);

        lArr = (lArr1 = (lArr1 = lArr1));
        iArrFld[(-11 >>> 1) % N] = (int)Long.reverseBytes((Test.instanceCount + Test.iFld) - Test.iFld);
        vMeth();
        Test.iFld >>>= 160;
        iArrFld[(Test.iFld >>> 1) % N] = (int)Test.fFld;
        for (i6 = 18; i6 < 352; i6++) {
            if (Test.bFld) {
                Test.fFld -= i6;
            } else {
                lArr1[i6 + 1] = i7;
            }
            for (f1 = 1; 75 > f1; ++f1) {
                iArrFld[i6] = (int)f1;
                Test.fFld -= f2;
                Test.iFld = (int)Test.instanceCount;
                Test.instanceCount += (long)f1;
                fArrFld = FuzzerUtils.float1array(N, (float)-1.126F);
                i9 = 1;
                while (++i9 < 2) {
                    by ^= (byte)-9L;
                    iArrFld[(int)(f1 - 1)] = Test.iFld;
                    switch (((-4 >>> 1) % 1) + 52) {
                    case 52:
                        try {
                            i8 = (1524020516 / Test.iFld);
                            i8 = (157 % i9);
                            Test.iFld = (i8 % i6);
                        } catch (ArithmeticException a_e) {}
                        break;
                    default:
                        if (Test.bFld) continue;
                        i8 = Test.iFld;
                    }
                    i7 <<= (int)1697040439032598360L;
                }
            }
            Test.iFld *= (int)Test.instanceCount;
            for (f3 = i6; f3 < 75; ++f3) {
                i10 >>= i8;
                Test.iFld += (int)(-2222844188063738695L + (f3 * f3));
            }
            for (i11 = 3; i11 < 75; i11++) {
                if (Test.bFld) continue;
            }
            i8 -= i8;
        }


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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}