package tests.javafuzzer2697;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:49:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4029888562L;
    public static float fFld=-29.492F;
    public static int iFld=32454;
    public static double dArrFld[][]=new double[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -16.102710);
        FuzzerUtils.init(Test.fArrFld, 2.423F);
    }

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i5) {

        int i6=-166, i7=-33412, iArr2[]=new int[N];
        short s=11461;

        FuzzerUtils.init(iArr2, 2);

        for (i6 = 12; 335 > i6; i6++) {
            Test.fFld -= -4374998432477861741L;
            i5 += (i6 | i7);
            s = (short)Test.instanceCount;
        }
        Test.fFld = i5;
        i7 -= i5;
        i7 = i6;
        i5 = i6;
        iArr2[(210 >>> 1) % N] = i5;
        vMeth1_check_sum += l + i5 + i6 + i7 + s + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(int i3, int i4) {

        byte by=-98;
        int i8=32909, i9=-44, i10=1, i11=-96, i12=10, iArr3[]=new int[N];
        float f=2.838F, fArr[]=new float[N];
        short s1=28483;

        FuzzerUtils.init(fArr, -20.18F);
        FuzzerUtils.init(iArr3, -103);

        vMeth1(Test.instanceCount, i4);
        by += (byte)i3;
        for (i8 = 17; 290 > i8; i8 += 3) {
            switch ((i8 % 2) + 50) {
            case 50:
                for (i10 = 1; i10 < 17; i10++) {
                    Test.instanceCount += (long)Test.fFld;
                    fArr = fArr;
                    i9 += i10;
                    Test.instanceCount += i10;
                    i4 = i9;
                    if (i11 != 0) {
                        vMeth_check_sum += i3 + i4 + by + i8 + i9 + i10 + i11 + Float.floatToIntBits(f) + i12 + s1 +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3);
                        return;
                    }
                    i11 >>= i11;
                    for (f = i10; f < 2; f++) {
                        iArr3[i10 + 1] = (int)Test.instanceCount;
                    }
                    i11 *= (int)-124.182F;
                }
            case 51:
                i3 <<= s1;
            }
        }
        vMeth_check_sum += i3 + i4 + by + i8 + i9 + i10 + i11 + Float.floatToIntBits(f) + i12 + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3);
    }

    public static byte byMeth() {

        int i1=-159, i13=-13, i14=54277, i15=-36, iArr1[]=new int[N];
        long l1=-20474L;
        boolean b=false, bArr[]=new boolean[N];
        short s2=-31776;
        double d=0.15627;
        byte by2=-79;

        FuzzerUtils.init(iArr1, 295);
        FuzzerUtils.init(bArr, true);

        i1 += (int)((--Test.fFld) - (Math.abs(i1) + (i1 * -101.50841)));
        switch (((((int)(Test.instanceCount + Test.instanceCount)) >>> 1) % 10) + 86) {
        case 86:
            i1 += (int)Math.abs(Test.fFld++);
            for (int i2 : iArr1) {
                byte by1=-110;
                if (i1 != 0) {
                }
                switch (((iArr1[(i2 >>> 1) % N] >>> 1) % 7) + 71) {
                case 71:
                    vMeth(i2, i2);
                    break;
                case 72:
                    for (l1 = 1; l1 < 4; l1++) {
                        Test.instanceCount += 16695;
                        i1 += i13;
                        i2 >>= Test.iFld;
                        i14 = 1;
                        do {
                            i2 += i2;
                            bArr[i14] = b;
                            i2 = (int)-92L;
                        } while (++i14 < 2);
                    }
                case 73:
                    i13 *= i1;
                    break;
                case 74:
                    Test.iFld <<= i1;
                case 75:
                    by1 = (byte)247;
                    break;
                case 76:
                    i15 -= Test.iFld;
                    break;
                case 77:
                    by1 -= (byte)Test.instanceCount;
                    break;
                default:
                    i15 += (int)Test.fFld;
                }
            }
            break;
        case 87:
            s2 /= (short)((long)(Test.fFld) | 1);
            break;
        case 88:
            i13 += Test.iFld;
            break;
        case 89:
            i1 += (int)d;
            break;
        case 90:
            iArr1[(i1 >>> 1) % N] = i1;
        case 91:
            i13 += i14;
        case 92:
            Test.iFld = (int)l1;
        case 93:
            bArr[(i15 >>> 1) % N] = b;
            break;
        case 94:
            by2 = (byte)-41;
            break;
        case 95:
            iArr1[(i13 >>> 1) % N] &= (int)Test.instanceCount;
            break;
        }
        long meth_res = i1 + l1 + i13 + i14 + (b ? 1 : 0) + i15 + s2 + Double.doubleToLongBits(d) + by2 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by3=58;
        int i16=-199, i17=1, i18=241, i19=12, i20=-17915, iArr[]=new int[N];
        double d1=-1.46049;
        long l2=2L;

        FuzzerUtils.init(iArr, -6822);

        for (int i : iArr) {
            short s3=17103;
            Test.instanceCount *= ((i++) + (--i));
            Test.instanceCount += (byMeth() << Test.iFld);
            iArr[(Test.iFld >>> 1) % N] = i;
            iArr[(i >>> 1) % N] = by3;
            Test.dArrFld[(Test.iFld >>> 1) % N][(48052 >>> 1) % N] = i;
            i = (int)Test.instanceCount;
            s3 <<= (short)i;
            Test.instanceCount *= i;
            for (i16 = 3; i16 < 63; ++i16) {
                i17 -= by3;
            }
        }
        Test.fFld = i16;
        Test.dArrFld[(i17 >>> 1) % N][(i16 >>> 1) % N] += i16;
        for (i18 = 10; i18 < 275; i18++) {
            iArr[i18 + 1] %= (int)((long)(Test.fFld) | 1);
            i17 = i16;
            i17 = (int)Test.fFld;
            d1 -= d1;
            switch ((i18 % 2) + 111) {
            case 111:
                Test.iFld += i18;
                i17 += (int)Test.instanceCount;
                Test.fFld = i19;
            case 112:
                Test.fArrFld[i18] += Test.instanceCount;
                d1 += i18;
                if (true) {
                    i20 = 1;
                    do {
                        Test.iFld = i16;
                        Test.fFld += i18;
                        i17 += (((i20 * Test.instanceCount) + Test.fFld) - i18);
                        i19 -= 61291;
                    } while (++i20 < 95);
                } else if (false) {
                    l2 *= i18;
                }
                break;
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}