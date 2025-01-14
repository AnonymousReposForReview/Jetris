package tests.javafuzzer2583;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:56:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-775649659114700864L;
    public static byte byFld=56;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 205);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l1) {

        int i7=-17699, i8=-13, i9=-2, i10=-83, iArr1[]=new int[N];
        byte by=101, byArr[]=new byte[N];
        long l2=3532544505907918884L;
        double d1=-2.39236;
        float f1=1.22F, fArr[][]=new float[N][N];
        short s1=-26613;

        FuzzerUtils.init(iArr1, 1348);
        FuzzerUtils.init(fArr, 2.62F);
        FuzzerUtils.init(byArr, (byte)54);

        for (i7 = 6; i7 < 334; i7++) {
            by = (byte)i8;
        }
        iArr1[(i8 >>> 1) % N] = 46374;
        l2 = i7;
        d1 = 1;
        do {
            for (i9 = 1; i9 < 7; i9++) {
                switch ((int)((d1 % 2) + 94)) {
                case 94:
                    if (i9 != 0) {
                        vMeth_check_sum += l1 + i7 + i8 + by + l2 + Double.doubleToLongBits(d1) + i9 + i10 +
                            Float.floatToIntBits(f1) + s1 + FuzzerUtils.checkSum(iArr1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr);
                        return;
                    }
                    f1 -= -8;
                    break;
                case 95:
                default:
                    f1 -= i8;
                    switch (((29 >>> 1) % 9) + 15) {
                    case 15:
                        l2 = i7;
                        break;
                    case 16:
                        fArr[i9] = fArr[(int)(d1 + 1)];
                        break;
                    case 17:
                        i8 += i9;
                        byArr[(i7 >>> 1) % N] += (byte)i10;
                        break;
                    case 18:
                        i10 &= -25369;
                        break;
                    case 19:
                        l2 >>>= l2;
                        break;
                    case 20:
                        i10 += s1;
                    case 21:
                        i8 += (((i9 * i9) + i10) - i7);
                    case 22:
                        i8 += (-8 + (i9 * i9));
                        break;
                    case 23:
                        l1 = Test.instanceCount;
                        break;
                    }
                }
            }
        } while (++d1 < 228);
        vMeth_check_sum += l1 + i7 + i8 + by + l2 + Double.doubleToLongBits(d1) + i9 + i10 + Float.floatToIntBits(f1) +
            s1 + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth1(int i6) {

        int i11=176, i12=-207;
        boolean b1=false;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 113.272F);

        vMeth(Test.instanceCount);
        for (i11 = 6; i11 < 155; i11++) {
            i6 = (int)0L;
            switch ((i11 % 2) + 29) {
            case 29:
            case 30:
            }
            i12 -= i6;
            b1 = b1;
            i12 -= i11;
            fArr1[i11] += i12;
            i6 = i12;
        }
        i6 = i12;
        i12 >>= 31989;
        Test.iArrFld[(26422 >>> 1) % N] = i12;
        long meth_res = i6 + i11 + i12 + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i5, long l) {


        iMeth1(i5);
        i5 = i5;
        Test.iArrFld[(i5 >>> 1) % N] += -26490;
        long meth_res = i5 + l;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=49255, i1=12, i2=-14, i3=169, i4=6, i13=-8181, i14=-3, i15=47989, i16=10224, iArr[]=new int[N];
        boolean b=true;
        float f=104.264F;
        short s=3769;
        double d=-63.9413;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -30168);
        FuzzerUtils.init(lArr, -9220042986108775426L);

        for (i = 2; 235 > i; ++i) {
            i1 += (i | i);
            iArr[i + 1] <<= i;
            Test.instanceCount = (--iArr[i]);
            i1 = (int)Test.instanceCount;
            i2 = 1;
            do {
                iArr = (iArr = iArr);
                if ((i != iArr[i2 + 1]) | b) break;
                for (i3 = 1; 1 > i3; ++i3) {
                    f = (((Test.instanceCount + Test.instanceCount) - (-(lArr[(i2 >>> 1) % N] <<= i3))) ^ (i1 =
                        Short.reverseBytes(s)));
                    d = Test.instanceCount;
                    Test.instanceCount += (i3 ^ Test.instanceCount);
                    s = (short)((iMeth(i2, Test.instanceCount) - i2) + i4);
                    i4 = (int)Test.instanceCount;
                }
                Test.iArrFld[i - 1] = i4;
                if (b) continue;
                for (i13 = i2; 1 > i13; ++i13) {
                    i14 += (i13 + Test.byFld);
                    i14 += (int)d;
                    i14 -= (int)Test.instanceCount;
                    s = (short)i;
                    i1 = -13;
                    iArr[i2 + 1] <<= i14;
                }
                Test.instanceCount += Test.byFld;
                Test.instanceCount = i14;
                s *= (short)Test.instanceCount;
                Test.instanceCount >>= i14;
            } while (++i2 < 108);
            for (i15 = 5; 108 > i15; ++i15) {
                Test.iArrFld[i15] = 14450;
                i1 *= i1;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
