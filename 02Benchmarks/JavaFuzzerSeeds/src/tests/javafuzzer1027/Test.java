package tests.javafuzzer1027;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public static byte byFld=-121;
    public static volatile boolean bFld=false;
    public boolean bFld1=false;
    public float fArrFld[]=new float[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i8=-6, i9=13, i10=5, i11=-181, i12=45242, iArr[]=new int[N];
        float f=68.36F, f1=0.976F;
        double d1=-89.51591;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(lArr, 33937L);

        for (i8 = 7; i8 < 178; ++i8) {
            f = 1;
            while (++f < 9) {
                if (Test.bFld) continue;
                for (i10 = 1; i10 > 1; i10 -= 3) {
                    iArr[i8 - 1] -= (int)Test.instanceCount;
                    i9 *= (int)Test.instanceCount;
                    f1 += i11;
                    i11 = 165;
                    f1 += i12;
                    lArr = lArr;
                    i9 = (int)d1;
                    Test.bFld = Test.bFld;
                    i9 += i10;
                    iArr[(int)(f - 1)] *= i8;
                }
                i11 = i11;
            }
        }
        vMeth1_check_sum += i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + Float.floatToIntBits(f1) + i12 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(long l1, int i3, int i4) {

        int i5=-10636, i6=5, i7=10, i13=-204, i14=-212;
        float f2=2.662F;

        i5 = 1;
        while (++i5 < 313) {
            for (i6 = 1; 5 > i6; ++i6) {
                l1 += (i6 * i6);
            }
            i3 += ((i7 + (i7 + Test.byFld)) + i4);
            vMeth1();
            f2 -= Test.instanceCount;
            f2 = 11L;
            Test.instanceCount = i5;
            for (i13 = 1; i13 < 5; i13++) {
                i14 = i7;
                Test.instanceCount += (i13 * i13);
                i14 = i13;
            }
            i14 >>= i13;
            i4 += (i5 - i7);
        }
        i7 >>= i3;
        long meth_res = l1 + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f2) + i13 + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2, long l, double d) {

        int i15=-26430, i16=-5, i18=4, i19=-62210, i20=-12, iArr1[]=new int[N];
        short s1=-25207;

        FuzzerUtils.init(iArr1, -190);

        l = (Integer.reverseBytes(iMeth(Test.instanceCount, i2, -162)) >> i2);
        for (i15 = 5; i15 < 299; ++i15) {
            i16 >>= (int)Test.instanceCount;
            i16 += i2;
            i2 -= (int)-1.44922;
            i2 <<= Test.byFld;
            for (i18 = 1; i18 < 6; i18++) {
                i19 = i16;
                i19 += i15;
                i16 *= (int)l;
                s1 = (short)i18;
                try {
                    i20 = (-5748 % i15);
                    iArr1[i15 - 1] = (i2 % i20);
                    i2 = (42401 / i19);
                } catch (ArithmeticException a_e) {}
                iArr1 = iArr1;
            }
            l -= i16;
            if (false) continue;
        }
        vMeth_check_sum += i2 + l + Double.doubleToLongBits(d) + i15 + i16 + i18 + i19 + s1 + i20 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=41026, i1=18940, i21=8, i22=4, i23=14, i24=-5336, i25=12, i26=4, i27=-5, i28=-1, i29=8, i30=-41178,
            iArr2[]=new int[N];
        short s=2472;
        double d2=110.5469, dArr[]=new double[N];
        float f3=-123.234F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, 0);
        FuzzerUtils.init(lArr1, -73L);
        FuzzerUtils.init(dArr, 2.85301);

        for (i = 2; i < 258; i++) {
            s >>= (short)(i * ((i1 - 37) + Test.byFld));
        }
        vMeth(i1, Test.instanceCount, d2);
        i21 = 1;
        while ((i21 += 2) < 216) {
            for (i22 = 6; i22 < 232; i22 += 3) {
                i23 += (((i22 * f3) + i) - i);
                for (i24 = i22; i24 < 4; i24++) {
                    iArr2[i22] = (int)f3;
                    i25 += Test.byFld;
                    Test.instanceCount *= 9248;
                    if (bFld1) {
                        Test.instanceCount >>= i1;
                    }
                    i1 >>= i21;
                    d2 *= i;
                    i23 += (int)f3;
                    i1 = i24;
                }
                for (i26 = 1; i26 < 4; i26++) {
                    i27 <<= (int)Test.instanceCount;
                    i25 += (int)f3;
                    f3 += (((i26 * i21) + i25) - i1);
                    if (bFld1) continue;
                }
                i25 <<= (int)1482199901L;
                i27 = (int)-10.705F;
                i23 = i22;
            }
            for (i28 = 1; i28 < 232; i28++) {
                dArr[i21] *= f3;
                i30 = 1;
                while (++i30 < 2) {
                    fArrFld[i21 + 1] += 4677298561356234788L;
                    i29 *= i24;
                }
                Test.instanceCount += i27;
            }
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}