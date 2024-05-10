package tests.javafuzzer1554;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:54:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-27957L;
    public static volatile double dFld=51.17886;
    public static float fFld=39.565F;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i4, int i5) {

        long l=237L, l1=-9474L;
        int i6=2, i7=14, i8=12, i9=-35833, iArr1[]=new int[N];
        short s=27606;

        FuzzerUtils.init(iArr1, -13898);

        i4 *= (int)l;
        for (i6 = 8; i6 < 383; i6++) {
            for (i8 = i6; i8 < 5; ++i8) {
                i7 = (int)l;
                iArr1[i6] %= -10838;
                i4 -= i6;
            }
            i5 >>= (int)l;
            Test.dFld -= -14;
            i7 += -29798;
            i5 = (int)l;
            l1 = 1;
            do {
                i9 += (int)l1;
                i7 += i8;
                i7 -= i5;
                s *= (short)i8;
            } while (++l1 < 5);
        }
        long meth_res = i4 + i5 + l + i6 + i7 + i8 + i9 + l1 + s + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(float f) {

        int i3=-3, i10=2, i11=14, i12=204, i13=3, i14=-2, i15=-3, i16=7, iArr[]=new int[N];
        long l2=-3432726935342918156L, lArr[][]=new long[N][N];
        boolean b=true;

        FuzzerUtils.init(iArr, -5705);
        FuzzerUtils.init(lArr, 7247617924813195039L);

        i3 = (iArr[(i3 >>> 1) % N]++);
        i3 -= (int)(dMeth(i3, i3) + Test.instanceCount);
        i3 = i3;
        Test.instanceCount = Test.instanceCount;
        for (i10 = 10; i10 < 225; i10 += 2) {
            if (b) {
                i11 += (i10 * f);
                for (i12 = 15; i12 > 1; i12--) {
                    if (true) break;
                }
                for (l2 = i10; l2 < 15; l2++) {
                    for (i15 = 1; 1 > i15; i15++) {
                        lArr[i15 + 1][i15 - 1] += i11;
                        Test.instanceCount = i3;
                        iArr[(int)(l2 + 1)] >>= i13;
                        b = b;
                    }
                }
            } else if (b) {
                Test.instanceCount += i10;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i3 + i10 + i11 + i12 + i13 + l2 + i14 + i15 + i16 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i1, int i2) {

        float f1=0.616F;
        double d=32.33583;
        int i17=-117, i18=-2, i20=-3, i21=49319, iArr2[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr2, 10626);

        i1 = (int)Long.reverseBytes((long)(i2 * (++Test.dFld)));
        vMeth(f1);
        for (d = 2; d < 214; d++) {
            i18 = 8;
            do {
                int i19=58;
                iArr2[(int)(d)] *= i1;
                iArr2 = iArr2;
                i17 >>= i19;
            } while ((i18 -= 2) > 0);
            Test.fFld -= (float)1.84470;
            for (i20 = 1; i20 < 8; ++i20) {
                if (b1) break;
                iArr2[i20] += 60104;
                if (i18 != 0) {
                }
                try {
                    i17 = (i2 / -776961279);
                    i2 = (i18 % 1836);
                    i1 = (-1054335928 / iArr2[i20 - 1]);
                } catch (ArithmeticException a_e) {}
                i21 += i21;
                Test.fFld = i2;
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i17 + i18 + i20 + i21 + (b1 ?
            1 : 0) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=13;

        i *= ((-iMeth(i, i)) + i);


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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
