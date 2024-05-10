package tests.javafuzzer3103;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:49:12 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=112L;
    public static boolean bFld=true;
    public volatile long lFld=12L;
    public int iArrFld[][]=new int[N][N];
    public boolean bArrFld[][]=new boolean[N][N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(short s, byte by1) {

        int i12=-14, i13=-227, i14=-4, i15=-4, iArr1[]=new int[N];
        float f3=2.394F;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, 11510);
        FuzzerUtils.init(dArr, 0.27351);

        i12 = 1;
        do {
            f3 += (7 + (i12 * i12));
            for (i13 = i12; i13 < 6; ++i13) {
                Test.instanceCount *= i13;
                iArr1[i13] = (int)Test.instanceCount;
                i15 += i13;
                i15 = i12;
                dArr[i13 - 1] += i15;
                i14 = i13;
                i15 = i14;
            }
            Test.instanceCount &= i12;
            i15 = (int)-39658L;
            i15 = (int)171L;
        } while (++i12 < 289);
        i14 = i15;
        i15 = i14;
        long meth_res = s + by1 + i12 + Float.floatToIntBits(f3) + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(float f2, int i8, int i9) {

        int i10=-60654, i11=34500, i16=17475, i17=-60, i18=-170, i19=-77, i20=34436, i21=-19589, iArr2[]=new int[N];
        short s1=-890;
        byte by2=-109;
        double d1=0.51335;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 96L);
        FuzzerUtils.init(iArr2, 10);

        i10 = 1;
        do {
            Test.instanceCount *= (long)(f2 * (Test.instanceCount--));
        } while (++i10 < 326);
        i11 = (int)(((i10 + i10) + iMeth(s1, by2)) + Test.instanceCount);
        for (i16 = 128; i16 > 8; i16 -= 3) {
            i11 -= 51;
        }
        lArr[(i11 >>> 1) % N] <<= i10;
        i11 ^= i16;
        i18 = 1;
        do {
            d1 = s1;
            s1 += (short)(((i18 * i10) + i9) - i16);
        } while (++i18 < 349);
        i19 = 1;
        do {
            for (i20 = 1; 6 > i20; i20++) {
                i8 *= (int)Test.instanceCount;
                Test.instanceCount += (i20 | i11);
                iArr2[(i8 >>> 1) % N] -= by2;
            }
        } while (++i19 < 274);
        vMeth1_check_sum += Float.floatToIntBits(f2) + i8 + i9 + i10 + i11 + s1 + by2 + i16 + i17 + i18 +
            Double.doubleToLongBits(d1) + i19 + i20 + i21 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(float f1) {

        long l=176L;
        int i3=-22, i4=-92, i5=7, i6=58, i7=-45340, i22=151, i23=-42903;
        boolean b=true;

        for (l = 21; l < 346; ++l) {
            i3 += (int)(((l * i3) + i3) - i3);
            for (i4 = (int)(l); 5 > i4; ++i4) {
                for (i6 = 1; i6 > 1; i6 -= 3) {
                    i5 >>= (int)(-13 - (Test.instanceCount--));
                }
                vMeth1(2.935F, 4, 21533);
                i7 -= (int)f1;
                Test.instanceCount = 10;
                Test.instanceCount <<= i5;
            }
            for (i22 = 1; i22 < 5; ++i22) {
                if (i5 != 0) {
                    vMeth_check_sum += Float.floatToIntBits(f1) + l + i3 + i4 + i5 + i6 + i7 + i22 + i23 + (b ? 1 : 0);
                    return;
                }
                i3 -= i22;
                b = b;
                i3 = -43925;
                i3 += i23;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + l + i3 + i4 + i5 + i6 + i7 + i22 + i23 + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=-11, i2=46, i24=-51184, i25=10, iArr[]=new int[N];
        double d=10.98503, d2=-71.95689, dArr1[]=new double[N];
        byte by=51;
        float f=0.795F, fArr[]=new float[N];
        short s2=-14991, sArr[]=new short[N];

        FuzzerUtils.init(iArr, 31);
        FuzzerUtils.init(fArr, 108.962F);
        FuzzerUtils.init(sArr, (short)882);
        FuzzerUtils.init(dArr1, -74.82474);

        for (i = 2; i < 358; ++i) {
            for (d = 2; d < 71; d += 3) {
                Test.instanceCount = (by++);
                iArr[i - 1] -= (int)Math.abs((i1 * f) * (i2++));
                Test.instanceCount -= (long)(i + (--fArr[i]));
                vMeth(f);
                if (Test.bFld) continue;
                d2 -= i2;
                s2 += (short)(((d * i2) + i2) - i);
                Test.bFld = Test.bFld;
            }
            if (Test.bFld) continue;
            sArr[i] *= (short)-34062;
            iArrFld[i - 1][i - 1] = (int)Test.instanceCount;
            i1 = i2;
            iArr[i - 1] += i;
            i1 |= 17359;
        }
        iArrFld[(-22663 >>> 1) % N][(i1 >>> 1) % N] <<= (int)Test.instanceCount;
        for (i24 = 23; 374 > i24; i24 += 2) {
            dArr1[i24 - 1] += i25;
            iArr[i24] += i25;
            i2 -= i1;
            i1 += 4762;
            i25 += (i24 ^ (long)f);
            bArrFld[i24 - 1][i24] = false;
        }
        iArr[(134 >>> 1) % N] -= (int)lFld;

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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}